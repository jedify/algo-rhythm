package com.algorhythm.easy.string;

public class DefangingIpAddress {
    public static void main(String[] args) {
        System.out.println(new DefangingIpAddress().defangIPaddr("1.1.1.1"));
    }
    public String defangIPaddr(String address) {
        StringBuffer result = new StringBuffer("");
        for(int i=0;i<address.length();i++) {
            char ch = address.charAt(i);
            if(ch == '.') {
                result.append("[.]");
            }else{
            result.append(ch);}
        }
        return result.toString();
    }
}
