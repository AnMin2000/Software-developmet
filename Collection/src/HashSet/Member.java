package HashSet;


public class Member {
 public String name;
 public int age;

 public Member(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public int hashCode() {
     return this.name.hashCode() + this.age;
 }

 public boolean equals(Object obj) {
     Member target;
     if (obj instanceof Member && (target = (Member)obj) == (Member)obj) {
         return target.name.equals(this.name) && target.age == this.age;
     } else {
         return false;
     }
 }
}
