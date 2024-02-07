package javaAllExamples;
public class IterationSeven{
public static void main(String[] args){
int [] [] arr={{2,7,9},{5,4,8},{10,3,7},{12,3,5}};
for(int [] innerarry: arr ){
for(int var:innerarry){
System.out.println(var);
}
}
}
}