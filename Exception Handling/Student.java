
public class Student {
    String name;
    int sem;
    
    public Student(String name, int sem) throws InvalidSemException{
        if(sem<1 || sem>8){
            throw new InvalidSemException("Invalid Sem");
        }else{
            this.name = name;
            this.sem = sem;
        }
    }
}
