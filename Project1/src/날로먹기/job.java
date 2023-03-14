package 날로먹기;

class Job extends Woman{ //Woman클래스(부모클래스)를 상속받음 : 

   String job;
   
   public void info() {//부모(Woman)클래스에 있는 info()메서드를 재정의
//       super.info();				//super가 있어야 Woman클래스의 info메서드를 추가할수 있다
       System.out.println("여자의 직업은 "+job+"입니다.");
   }
}
