package com.class15;

public class UpperLowerCase {

	public static void main(String[] args) {

	       String word ="abrakadabra";

	      String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

	      System.out.println(replace);

	}}
