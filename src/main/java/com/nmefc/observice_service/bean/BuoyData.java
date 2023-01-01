package com.nmefc.observice_service.bean;

import java.math.BigDecimal;
import java.util.Date;

public class BuoyData {
    private Long id;

    private Date queryTime;

    private String time;

    private String site;

    private Date create;

    private Date modified;

    private Byte isDelete;

    private BigDecimal ws;

    private BigDecimal wd;

    private BigDecimal wsm;

    private BigDecimal at;

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

    public Date getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

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

    public BigDecimal getAt() {
        return at;
    }

    public void setAt(BigDecimal at) {
        this.at = at;
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