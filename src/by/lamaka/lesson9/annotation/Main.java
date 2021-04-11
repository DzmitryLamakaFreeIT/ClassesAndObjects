package by.lamaka.lesson9.annotation;


public class Main {
    public static void main(String[] args) {
        if (ProgramLogic.checkClassByAnnotation(MyService.class)) {
            MyService myService = new MyService();
            myService.setId(1);
            myService.setName("ololo");
            ProgramLogic.thisClassInfo(myService);
        }


    }

}
