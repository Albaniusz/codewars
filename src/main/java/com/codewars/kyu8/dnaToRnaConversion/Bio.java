package com.codewars.kyu8.dnaToRnaConversion;

/**
 * Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed
 * of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
 * <p>
 * Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical
 * structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').
 * <p>
 * Create a function which translates a given DNA string into RNA.
 * <p>
 * For example:<br/>
 * "GCAT"  =>  "GCAU"
 * <p>
 * The input string can be of arbitrary length - in particular, it may be empty. All input is guaranteed to be valid,
 * i.e. each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.
 */
public class Bio {
    public String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }
}
