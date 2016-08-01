package com.codelabs;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String,String> mahasiswa=new HashMap<String,String>();
        String nim="10104007";
        String nama="Adam MB";

        //operasi input ke hashmap
        mahasiswa.put(nim,nama);

        nim="10114413";
        nama="Firman N.F.";
        mahasiswa.put(nim,nama);

        //operasi output dari hashmap
        System.out.println(mahasiswa.get("10114413"));
    }
}
