package com.transportation.SIRI_IL.Server;

import java.io.InputStream;


public class SiriServerUtils {
	
	protected static String InputStreamToString(InputStream in, int length) {
		String str = null;
		byte[] input = new byte[length];
        try {
			in.read(input, 0, length);
			str = new String(input,"UTF-8");
		} catch (Exception e) {

		}
		return str;
	}
	

}
