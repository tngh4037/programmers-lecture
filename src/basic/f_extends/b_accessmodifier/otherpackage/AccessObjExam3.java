package basic.f_extends.b_accessmodifier.otherpackage;

import basic.f_extends.b_accessmodifier.AccessObj;

public class AccessObjExam3 extends AccessObj {

    public static void main(String[] args) {
        AccessObjExam3 obj = new AccessObjExam3();
        System.out.println(obj.p);
        System.out.println(obj.p2); // 패키지는 다르지만 상속관계에 있으므로 접근 가능
        // System.out.println(obj.k); // 같은 패키지가 아니므로 접근 불가
        // System.out.println(obj.i); // private 이므로 접근 불가
    }
}
