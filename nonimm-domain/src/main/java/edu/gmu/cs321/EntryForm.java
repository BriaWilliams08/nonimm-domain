package edu.gmu.cs321;

    public class EntryForm {
        private int formid;
        private String step;
        private int date;
    
        public EntryForm(int formid, int date, String step) {
            this.formid = formid;
            this.date = date;
            if(!(step.equals("Entry") || step.equals("Review") || step.equals("Approval"))) {
                throw new IllegalArgumentException("Invalid step!");
            } else {
                this.step = step;
            }
        }
    
        public EntryForm(int formid, int date) {
            this.formid = formid;
            this.date = date;
            this.step = "Entry";
        }
    
        public int getformid() {
            return formid;
        }
    
        public String getStep() {
            return step;
        }
    
        public int getdate() {
            return date;
        }
    
        public void setformid(int id) {
            formid = id;
        }
    
        public void setStep(String st) {
            if(!(st.equals("Entry") || st.equals("Review") || st.equals("Approval"))) {
                throw new IllegalArgumentException("Invalid step!");
            } else {
                step = st;
            }
        }
    
        public void setdate(int date) {
            date = date;
        }
    
        
    }

