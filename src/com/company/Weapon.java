package com.company;

public class Weapon {
    private String sniper;
    private String svd;

    public Weapon(String sniper, String svd) {
        this.sniper = sniper;
        this.svd = svd;
    }
        public String getSniper() {
        return sniper;
    }

    public void setSniper(String sniper) {
        this.sniper = sniper;
    }

    public String getSvd() {
        return svd;
    }

    public void setSvd(String svd) {
        this.svd = svd;
    }
}
