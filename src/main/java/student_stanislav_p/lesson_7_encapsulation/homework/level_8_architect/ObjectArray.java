package student_stanislav_p.lesson_7_encapsulation.homework.level_8_architect;

    class ObjectArray{
        public static void main(String args[]){
            Account obj[] = new Account[2] ;
            obj[0] = new Account();
            obj[1] = new Account();
            obj[0].setData(1,2);
            obj[1].setData(3,4);
            System.out.println("For Array Element 0");
            obj[0].showData();
            System.out.println("For Array Element 1");
            obj[1].showData();
        }
    }
