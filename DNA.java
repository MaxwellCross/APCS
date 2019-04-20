/*
Maxwell Cross
*/


import java.util.*;
/*
Maxwell Cross
*/

import java.util.*;
import java.io.*;

public class DNA {

   public static final int MINCODONS = 4;
   public static final double MINPRCNT = 30.0;
   public static final int NUC_PER_COD = 3;
   private static final double A = 135.128;
   private static final double C = 111.103;
   private static final double G = 151.128;
   private static final double T = 125.107;

   public static void main(String[] args)
           throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      System.out.println("Please input file name:");
      String dna = console.next();
      System.out.println("dna: " + dna);
   
      Scanner input = new Scanner(new File(dna));
      while (input.hasNext()) {
         String name = input.nextLine();
         String sequence = input.nextLine().toUpperCase();
         int seqLength = sequence.length();
         int[] nucCount = countNuc(sequence) ;
         String[] codonGroups = makeCodons(sequence);
         double[] massPercent = calcMassPcnt(nucCount);
         String[] codons = makeCodons(sequence);
         System.out.println("Name: " + name);
         System.out.println("Nucleotides: " + sequence);
         System.out.println("Nucleotide counts: " + Arrays.toString(nucCount));
         System.out.println("Mass percentages: " + Arrays.toString(massPercent));
         System.out.println("Codons: " + Arrays.toString(codonGroups));
         System.out.println("Encodes a protein: " + isProtein(codons, massPercent) + "\n");
      }
   }


   public static int[] countNuc(String sequence) { //A,C,T,G
      int[] nucOccurence = new int[4];
      for (int i = 0; i < sequence.length(); i++) {
         char nuc = sequence.charAt(i);
         
         // we can get rid of all these if statements below by coming up with 
         // an intermediate step.
         // Need to convert nuc to a number
         // e.g. 'a' -> 0
         // e.g. 'A' -> 0
         // e.g. 'c' -> 1
         // e.g. 'C' -> 1
         //      'g' -> 2
         //      'G' -> 2
         //      't' -> 3
         //      'T' -> 3
         
         // then the result can be used just like in the text book
         // something like:
         //    nucOccurence[result] += 1;
      
         if (whichNuc(nuc, "A")) {
            nucOccurence[0] += 1;
         }
         else if (whichNuc(nuc, "C")) {
            nucOccurence[1] += 1;
         } else if (whichNuc(nuc, "G")) {
            nucOccurence[2] += 1;
         } else if (whichNuc(nuc, "T")) {
            nucOccurence[3] += 1;
         }
      
      }
      return nucOccurence;
   }
   
   public static boolean whichNuc(char existingNuc, String searchedNuc ) {
      String hold = "";
      String existingNucSt = hold + existingNuc;
      boolean matches = existingNucSt.equalsIgnoreCase(searchedNuc);
      return matches;
   }
      


   public static double[] calcMassPcnt(int[] nucOcc) {
      double[] nucs = {A, C, G, T};
      double massTotal = 0.0;
      double[] massPcnt = new double[4];
      for (int i = 0; i < 4; i++) {
         massTotal += (nucs[i] * nucOcc[i]);
      }
      for (int i = 0; i < 4; i++) {
         double percentage = ((double)nucOcc[i] * nucs[i]) / massTotal;
         percentage = percentage * 1000;
         percentage = Math.round(percentage);
         percentage = (percentage) / 10;
         massPcnt[i] = percentage;
      }
      return massPcnt;
   }






   public static String[] makeCodons(String input) {
      int l = input.length() / NUC_PER_COD;
      String[] codons = new String[l];
      for (int i = 0; i < l; i++) {
         codons[i] = input.substring(i * NUC_PER_COD, (i + 1) * NUC_PER_COD);
      }
      return codons;
   
   }
   
   public static boolean isProtein(String[] codon, double[] massPercent) {
      
      // for safety, return early if codon is empty
      if (codon.length == 0 || massPercent.length != 4) {
         return false;
      }
          
      // 1st question: begins with a valid start codon (ATG) ?
      String firstCodon = codon[0];
      
      
      if (firstCodon.equals("ATG")) {
      
         // 2nd question: ends with a valid stop codon (TAA, TAG, or TGA)
         int lastIndex = codon.length - 1;
         String lastCodon = codon[lastIndex];
         if (lastCodon.equals("TAA") || lastCodon.equals("TAG") 
            || lastCodon.equals("TGA")) {
            
            // 3rd question: contains at least 4 codons, including its start and stop codons ?
            if (codon.length >= MINCODONS) {
               
               // 4th question: at least 30% of its mass is Cytosine and Guanine ?
               if (massPercent[1] + massPercent[2] >= MINPRCNT) {
                  return true;
               }
            }
         }
      }
      
      return false;
      
      
   }
   /*
   begins with a valid start codon (ATG)                                   <
   ends with a valid stop codon (TAA, TAG, or TGA)                         <
   contains at least 4 codons, including its start and stop codons         <
   at least 30% of its mass is Cytosine and Guanine   
   */
   
}
