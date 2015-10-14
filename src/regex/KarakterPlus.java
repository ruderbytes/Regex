/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.regex.*;

/**
 *
 * @author muhammad
 */
/*
karakter +(plus)berarti menampilkan karakter maksimal 1 kata dan di akhiri dengan sepasi
*/
public class KarakterPlus {
    	public static void main(String[] args) {
		String str = "Ahmad Rosid abbbc AK 12345 PA (0728) 555-121 Yogyakarta ocittwo@gmail.com 412-555-1234 bbb cc";
		String str2 = "1Z aaa {{{ [[[";
		checkRegex("[0-9|a-zA-Z]+", str);
	}
 
	public static void checkRegex(String str1, String str2) {
		Pattern ptr = Pattern.compile(str1);
		Matcher regexMtcr = ptr.matcher(str2);
 
		while (regexMtcr.find()) {
			if (regexMtcr.group().length() != 0) {
				System.out.println(regexMtcr.group().trim());
			}
		}
	}
}
