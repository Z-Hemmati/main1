public class Info {
    private int personid;
    private int age;
    private int password;
    private int telephone;
    private String personname;
    private String address;
    private String education;

    public static class Builder {
        private int personid;
        private int age;
        private int password;
        private int telephone;
        private String personname;
        private String address;
        private String education;
        public Builder(int personid) {
            this.personid = personid;
        }

        public Builder personname(String name){
            this.personname = name;
            return this;
        }
        public Builder address(String address){
            this.address= address;
            return this;
        }
        public Builder educatiom(String education){
            this.education = education;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder password(int pass){
            this.password = pass;
            return this;
        }
        public Builder telephone(int tel){
            this.telephone = tel;
            return this;
        }
        public Info build(){

            Info account = new Info();
            account.personid=this.personid;
            account.personname=this.personname;
            account.age=this.age;
            account.address=this.address;
            account.education=this.education;
            account.telephone=this.telephone;
            account.password=this.password;
            return account;
        }
    }

}



