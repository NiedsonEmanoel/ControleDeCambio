package model.classesAbstratas;
import control.API;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class Moeda {
      
        private String ask;
        private String name;
        private String create_date;
   
         public double getCotacao() {
            double r = Double.parseDouble(this.ask);
            return r;
        }
         
        public String getMoeda() {
            return this.name;
        }
        
        public String getData() throws ParseException {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
            DateFormat saida = new SimpleDateFormat("dd/MM/yyyy");
            Date s = df.parse(this.create_date);
            return saida.format(s);
        }

        public void setName(String name) {
            this.name = name;
        }
        
        public void setCreate_date(String name) {
            this.create_date = name;
        }
        
        public void setAsk(String ask) {
            this.ask = ask;
        }
        
        
        @Override
        public String toString() {
            return this.name;
        }
    }

