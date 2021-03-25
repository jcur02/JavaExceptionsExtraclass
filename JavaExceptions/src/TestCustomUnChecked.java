class TestCustomUnChecked{

    static void validate(int age)throws AgeRestrictionException{
        if(age<18)
            throw new AgeRestrictionException("Underage people cant do use of this");
        else
            System.out.println("Approved");
    }

    public static void main(String args[]){
        try{
            validate(13);
        }catch(Exception m){System.out.println("Exception occured: "+m);}

        System.out.println("Program Finished");
    }
}
