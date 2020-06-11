package com.ljs.entity;

/**
 * create by ljs on 2020/6/10 11:11
 * <p>
 * description:
 */
public class StudentDemo {

    private Integer stuId;
    private String nameS;
    private Integer ages;


    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }

    public Integer getAges() {
        return ages;
    }

    public void setAges(Integer ages) {
        this.ages = ages;
    }

    @Override
    public String toString() {
        return "StudentDemo{" +
                "stuId=" + stuId +
                ", nameS='" + nameS + '\'' +
                ", ages=" + ages +
                '}';
    }
}
