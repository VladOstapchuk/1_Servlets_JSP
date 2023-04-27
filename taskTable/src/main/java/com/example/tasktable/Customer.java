package com.example.tasktable;

public class Customer {

    private String computerCase;

    private String cpuBrand;

    private String cpuCore;

    private String gpuBrand;

    private int gpuGenerate;

    private int ram;

    private String ramBrand;

    private String ramGenerate;

    private String motherboardBrand;

    private String motherboardChipset;

    private String monitorBrand;

    private String webCamBrand;

    private String mouseBrand;

    private String keyboardBrand;

    private String microphoneBrand;

    private String tableBrand;

    private String chairBrand;

    private String soundSpeakerBrand;

    public Customer(String computerCase, String cpuBrand, String cpuCore, String gpuBrand, int gpuGenerate, int ram, String ramBrand, String ramGenerate, String motherboardBrand, String motherboardChipset, String monitorBrand, String webCamBrand, String mouseBrand, String keyboardBrand, String microphoneBrand, String tableBrand, String chairBrand, String soundSpeakerBrand) {
        this.computerCase = computerCase;
        this.cpuBrand = cpuBrand;
        this.cpuCore = cpuCore;
        this.gpuBrand = gpuBrand;
        this.gpuGenerate = gpuGenerate;
        this.ram = ram;
        this.ramBrand = ramBrand;
        this.ramGenerate = ramGenerate;
        this.motherboardBrand = motherboardBrand;
        this.motherboardChipset = motherboardChipset;
        this.monitorBrand = monitorBrand;
        this.webCamBrand = webCamBrand;
        this.mouseBrand = mouseBrand;
        this.keyboardBrand = keyboardBrand;
        this.microphoneBrand = microphoneBrand;
        this.tableBrand = tableBrand;
        this.chairBrand = chairBrand;
        this.soundSpeakerBrand = soundSpeakerBrand;
    }

    public String getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(String computerCase) {
        this.computerCase = computerCase;
    }

    public String getCpuBrand() {
        return cpuBrand;
    }

    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }

    public String getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(String cpuCore) {
        this.cpuCore = cpuCore;
    }

    public String getGpuBrand() {
        return gpuBrand;
    }

    public void setGpuBrand(String gpuBrand) {
        this.gpuBrand = gpuBrand;
    }

    public int getGpuGenerate() {
        return gpuGenerate;
    }

    public void setGpuGenerate(int gpuGenerate) {
        this.gpuGenerate = gpuGenerate;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getRamBrand() {
        return ramBrand;
    }

    public void setRamBrand(String ramBrand) {
        this.ramBrand = ramBrand;
    }

    public String getRamGenerate() {
        return ramGenerate;
    }

    public void setRamGenerate(String ramGenerate) {
        this.ramGenerate = ramGenerate;
    }

    public String getMotherboardBrand() {
        return motherboardBrand;
    }

    public void setMotherboardBrand(String motherboardBrand) {
        this.motherboardBrand = motherboardBrand;
    }

    public String getMotherboardChipset() {
        return motherboardChipset;
    }

    public void setMotherboardChipset(String motherboardChipset) {
        this.motherboardChipset = motherboardChipset;
    }

    public String getMonitorBrand() {
        return monitorBrand;
    }

    public void setMonitorBrand(String monitorBrand) {
        this.monitorBrand = monitorBrand;
    }

    public String getWebCamBrand() {
        return webCamBrand;
    }

    public void setWebCamBrand(String webCamBrand) {
        this.webCamBrand = webCamBrand;
    }

    public String getMouseBrand() {
        return mouseBrand;
    }

    public void setMouseBrand(String mouseBrand) {
        this.mouseBrand = mouseBrand;
    }

    public String getKeyboardBrand() {
        return keyboardBrand;
    }

    public void setKeyboardBrand(String keyboardBrand) {
        this.keyboardBrand = keyboardBrand;
    }

    public String getMicrophoneBrand() {
        return microphoneBrand;
    }

    public void setMicrophoneBrand(String microphoneBrand) {
        this.microphoneBrand = microphoneBrand;
    }

    public String getTableBrand() {
        return tableBrand;
    }

    public void setTableBrand(String tableBrand) {
        this.tableBrand = tableBrand;
    }

    public String getChairBrand() {
        return chairBrand;
    }

    public void setChairBrand(String chairBrand) {
        this.chairBrand = chairBrand;
    }

    public String getSoundSpeakerBrand() {
        return soundSpeakerBrand;
    }

    public void setSoundSpeakerBrand(String soundSpeakerBrand) {
        this.soundSpeakerBrand = soundSpeakerBrand;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "computerCase='" + computerCase + '\'' +
                ", cpuBrand='" + cpuBrand + '\'' +
                ", cpuCore='" + cpuCore + '\'' +
                ", gpuBrand='" + gpuBrand + '\'' +
                ", gpuGenerate=" + gpuGenerate +
                ", ram=" + ram +
                ", ramBrand='" + ramBrand + '\'' +
                ", ramGenerate='" + ramGenerate + '\'' +
                ", motherboardBrand='" + motherboardBrand + '\'' +
                ", motherboardChipset='" + motherboardChipset + '\'' +
                ", monitorBrand='" + monitorBrand + '\'' +
                ", webCamBrand='" + webCamBrand + '\'' +
                ", mouseBrand='" + mouseBrand + '\'' +
                ", keyboardBrand='" + keyboardBrand + '\'' +
                ", microphoneBrand='" + microphoneBrand + '\'' +
                ", tableBrand='" + tableBrand + '\'' +
                ", chairBrand='" + chairBrand + '\'' +
                ", soundSpeakerBrand='" + soundSpeakerBrand + '\'' +
                '}';
    }
}
