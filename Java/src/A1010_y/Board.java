package A1010_y;

    public  class Board {
        private String subject;
        private String content;
        private String writer;


        public Board(String subject, String content, String writer){
            this.subject = subject;
            this.content = content;
            this.writer = writer;
        }

        public String getSubject(){return subject;}
        public void setSubject(String subject){this.subject =subject;}
        public String getContent(){return content;}
        public void setContent(String content){this.content = content;}
        public String getWriter(){return writer;}
        public void SetWriter(){this.writer = writer;}
    }


