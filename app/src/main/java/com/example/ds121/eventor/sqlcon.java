package com.example.ds121.eventor;
    public class accting {
        private int id;
        private String Username;
        private String Sub;
        private String Level;
        public accounting()
        {
        }
        public accounting(int id,String Sub,String Username, String Level)
        {
            this.id=id;
            this.Level=Level;
            this.Username = Username;
            this.Sub=Sub;
        }
        public void setId(int id) {
            this.id = id;
        }
        public void setLevel(String Level) {
            this.Level = Level;
        }
        public void setUserName(String Username) {
            this.Username = Username;
        }
        public void setSub(String Sub) {
            this.Sub = Sub;
        }
        public String getLevel() {
            return Level;
        }
        public int getId() {
            return id;
        }
        public String getUsername() {
            return Username;
        }
        public String getSub() {
            return Sub;
        }
    }
}
