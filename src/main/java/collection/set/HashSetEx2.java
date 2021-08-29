package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Member("홍서연", 40));
        set.add(new Member("홍길동", 40));

        System.out.println(set);

    }

    private static class Member {
        String name;
        int age;

        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "(" + name + ", " + age +" )";
        }
        // equals 재정의
        @Override
        public boolean equals(Object obj) {
            if ( obj instanceof Member) {
                Member m = (Member) obj;
                return this.name.equals(m.name) && this.age == m.age;
            } else {
                return false;
            }
        }

        // hashCode() 재정의
        @Override
        public int hashCode() {
            return this.name.hashCode() + age;
        }
    }
}


