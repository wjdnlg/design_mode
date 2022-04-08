package com.example.utils;

/**
 * @Author: Merengues
 * @Date: 6/8/2019 4:21 PM
 */
public class Base64Utils {
    private static final char S_BASE64CHAR[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte S_DECODETABLE[];

    static {
        S_DECODETABLE = new byte[128];
        for (int i = 0; i < S_DECODETABLE.length; i++) {
            S_DECODETABLE[i] = 127;
        }

        for (int i = 0; i < S_BASE64CHAR.length; i++) {
            S_DECODETABLE[S_BASE64CHAR[i]] = (byte) i;
        }

    }

    /**
     * @param ibuf
     * @param obuf
     * @param wp
     * @return
     */
    private static int decode0(char ibuf[], byte obuf[], int wp) {
        int outlen = 3;
        if (ibuf[3] == '=') {
            outlen = 2;
        }
        if (ibuf[2] == '=') {
            outlen = 1;
        }
        int b0 = S_DECODETABLE[ibuf[0]];
        int b1 = S_DECODETABLE[ibuf[1]];
        int b2 = S_DECODETABLE[ibuf[2]];
        int b3 = S_DECODETABLE[ibuf[3]];
        switch (outlen) {
            case 1: // '\001'
                obuf[wp] = (byte) (b0 << 2 & 252 | b1 >> 4 & 3);
                return 1;

            case 2: // '\002'
                obuf[wp++] = (byte) (b0 << 2 & 252 | b1 >> 4 & 3);
                obuf[wp] = (byte) (b1 << 4 & 240 | b2 >> 2 & 15);
                return 2;

            case 3: // '\003'
                obuf[wp++] = (byte) (b0 << 2 & 252 | b1 >> 4 & 3);
                obuf[wp++] = (byte) (b1 << 4 & 240 | b2 >> 2 & 15);
                obuf[wp] = (byte) (b2 << 6 & 192 | b3 & 63);
                return 3;
            default:
        }
        throw new RuntimeException("Internal error");
    }



    /**
     * @param data
     * @return
     */
    public static byte[] decode(String data) {
        char ibuf[] = new char[4];
        int ibufcount = 0;
        byte obuf[] = new byte[(data.length() / 4) * 3 + 3];
        int obufcount = 0;
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (ch != '=' && (ch >= S_DECODETABLE.length || S_DECODETABLE[ch] == 127)) {
                continue;
            }
            ibuf[ibufcount++] = ch;
            if (ibufcount == ibuf.length) {
                ibufcount = 0;
                obufcount += decode0(ibuf, obuf, obufcount);
            }
        }

        if (obufcount == obuf.length) {
            return obuf;
        } else {
            byte ret[] = new byte[obufcount];
            System.arraycopy(obuf, 0, ret, 0, obufcount);
            return ret;
        }
    }




    /**
     * @param data
     * @return
     */
    public static String encode(byte data[]) {
        return encode(data, 0, data.length);
    }

    /**
     * @param data
     * @param off
     * @param len
     * @return
     */
    public static String encode(byte data[], int off, int len) {
        if (len <= 0) {
            return "";
        }
        char out[] = new char[(len / 3) * 4 + 4];
        int rindex = off;
        int windex = 0;
        int rest;
        for (rest = len - off; rest >= 3; rest -= 3) {
            int i = ((data[rindex] & 255) << 16) + ((data[rindex + 1] & 255) << 8) + (data[rindex + 2] & 255);
            out[windex++] = S_BASE64CHAR[i >> 18];
            out[windex++] = S_BASE64CHAR[i >> 12 & 63];
            out[windex++] = S_BASE64CHAR[i >> 6 & 63];
            out[windex++] = S_BASE64CHAR[i & 63];
            rindex += 3;
        }

        if (rest == 1) {
            int i = data[rindex] & 255;
            out[windex++] = S_BASE64CHAR[i >> 2];
            out[windex++] = S_BASE64CHAR[i << 4 & 63];
            out[windex++] = '=';
            out[windex++] = '=';
        } else if (rest == 2) {
            int i = ((data[rindex] & 255) << 8) + (data[rindex + 1] & 255);
            out[windex++] = S_BASE64CHAR[i >> 10];
            out[windex++] = S_BASE64CHAR[i >> 4 & 63];
            out[windex++] = S_BASE64CHAR[i << 2 & 63];
            out[windex++] = '=';
        }
        return new String(out, 0, windex);
    }

}
