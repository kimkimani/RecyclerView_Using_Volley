package com.e.re_viewvolly.model;
public class Anime {
        String time;
        String league ;
        String match ;
        String tip ;
        String odd ;
        String results ;
        String status ;
        String country ;

    public Anime() {
        this.time=time;
        this.league=league;
        this.match=match;
        this.tip=tip;
        this.odd=odd;
        this.results=results;
        this.status=status;
        this.country=country;
    }


    public void setTime(String time) {
        this.time = time;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setOdd(String odd) {
        this.odd = odd;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public void setCountry(String country) {
        this.country = country;
    }


       public String getLeague() {
            return league;
        }
         public String getCountry() {
        return country;
    }
        public String getTime() {
            return time;
        }

        public String getMatch() {
            return match;
        }

        public String getTip() {
            return tip;
        }

        public String getOdd() {
            return odd;
        }

        public String getResults() {
            return results;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status=status;
        }
    }


