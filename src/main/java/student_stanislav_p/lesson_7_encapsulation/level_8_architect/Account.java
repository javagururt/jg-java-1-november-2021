package student_stanislav_p.lesson_7_encapsulation.level_8_architect;


    class Account{
        int a;
        int b;
        public void setData(int c,int d){
            a=c;
            b=d;
        }
        public void showData(){
            System.out.println("Value of a ="+a);
            System.out.println("Value of b ="+b);
        }

}
