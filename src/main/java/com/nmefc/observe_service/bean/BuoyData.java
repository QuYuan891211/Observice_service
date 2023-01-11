package com.nmefc.observe_service.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class BuoyData {
    private Long id;

    private Date queryTime;

    private String recordTime;

    private String site;

    private Date createTime;

    private Date modified;

    private Byte isDelete;

    private BigDecimal ws;

    private BigDecimal wd;

    private BigDecimal wsm;

    private BigDecimal att;

    private BigDecimal bp;

    private BigDecimal hu;

    private BigDecimal wt;

    private BigDecimal sl;

    private BigDecimal bg;

    private BigDecimal bx;

    private BigDecimal zq;

    private BigDecimal ybg;

    private BigDecimal yzq;

    private BigDecimal tenthbg;

    private BigDecimal tenthzq;

    private BigDecimal zbg;

    private BigDecimal zzq;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime == null ? null : recordTime.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public BigDecimal getWs() {
        return ws;
    }

    public void setWs(BigDecimal ws) {
        this.ws = ws;
    }

    public BigDecimal getWd() {
        return wd;
    }

    public void setWd(BigDecimal wd) {
        this.wd = wd;
    }

    public BigDecimal getWsm() {
        return wsm;
    }

    public void setWsm(BigDecimal wsm) {
        this.wsm = wsm;
    }

    public BigDecimal getAtt() {
        return att;
    }

    public void setAtt(BigDecimal att) {
        this.att = att;
    }

    public BigDecimal getBp() {
        return bp;
    }

    public void setBp(BigDecimal bp) {
        this.bp = bp;
    }

    public BigDecimal getHu() {
        return hu;
    }

    public void setHu(BigDecimal hu) {
        this.hu = hu;
    }

    public BigDecimal getWt() {
        return wt;
    }

    public void setWt(BigDecimal wt) {
        this.wt = wt;
    }

    public BigDecimal getSl() {
        return sl;
    }

    public void setSl(BigDecimal sl) {
        this.sl = sl;
    }

    public BigDecimal getBg() {
        return bg;
    }

    public void setBg(BigDecimal bg) {
        this.bg = bg;
    }

    public BigDecimal getBx() {
        return bx;
    }

    public void setBx(BigDecimal bx) {
        this.bx = bx;
    }

    public BigDecimal getZq() {
        return zq;
    }

    public void setZq(BigDecimal zq) {
        this.zq = zq;
    }

    public BigDecimal getYbg() {
        return ybg;
    }

    public void setYbg(BigDecimal ybg) {
        this.ybg = ybg;
    }

    public BigDecimal getYzq() {
        return yzq;
    }

    public void setYzq(BigDecimal yzq) {
        this.yzq = yzq;
    }

    public BigDecimal getTenthbg() {
        return tenthbg;
    }

    public void setTenthbg(BigDecimal tenthbg) {
        this.tenthbg = tenthbg;
    }

    public BigDecimal getTenthzq() {
        return tenthzq;
    }

    public void setTenthzq(BigDecimal tenthzq) {
        this.tenthzq = tenthzq;
    }

    public BigDecimal getZbg() {
        return zbg;
    }

    public void setZbg(BigDecimal zbg) {
        this.zbg = zbg;
    }

    public BigDecimal getZzq() {
        return zzq;
    }

    public void setZzq(BigDecimal zzq) {
        this.zzq = zzq;
    }
}