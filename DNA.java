//A program that determines whether there is a protein in a strand of DNA.

public class DNA {
  
    public static void main(String[] args) {
               
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-

      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
      String dna = dna3;
      
//Find the length of the dna string
      int length = dna.length();
      System.out.println("Length: " + length);
//Find the start (atg) and stop codon (tga)
      int start = dna.indexOf("ATG");
      System.out.println("Start: " + start);

      int stop = dna.indexOf("TGA");
      System.out.println("Stop: " + start);
      
    }
    
  }
  