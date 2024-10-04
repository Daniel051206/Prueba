public class anagrama {
    public static void main(String[] args) {
        
        char[] array_palabra = {'A','M','O','R'};
        char[] array_palabra2 = {'R','O','M','A'};
        
        int longitud_1= array_palabra.length;
        int longitud_2= array_palabra2.length;

        int contador = 0;
        for (int i=0; i < longitud_1; i++){
            for (int j=0; j < longitud_2; j++){
                if (array_palabra[i] == array_palabra2[j]){
                   contador ++;
                   array_palabra2[j] = ' ';
                   break; 
                }
            }
        }
        if (contador == longitud_1){
            System.out.println("Son anagramas");
        } else{
            System.out.println("No son anagramas");
        }   
        
            
    }
    
}