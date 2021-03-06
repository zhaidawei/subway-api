package com.chaosapollo.subway.entity;

import com.chaosapollo.subway.commons.DeleteState;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by steven on 22/09/2016.
 */
@Entity
@Table(name = "contract_approval", schema = "hengsheng_subway_cloud", catalog = "")
public class ContractApprovalEntity {
    private long id;
    private long contractId;
    private int submitUserId;
    private Timestamp submtiDate;
    private Integer approvalUserId;
    private Timestamp approvalDate;
    private byte status;
    private String advice;
    private Timestamp createDate;
    private Timestamp modificationTime;
    private DeleteState delState;
    private ContractEntity contract;

    @Id
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    @Basic
//    @Column(name = "CONTRACT_ID", nullable = false)
//    public long getContractId() {
//        return contractId;
//    }
//
//    public void setContractId(long contractId) {
//        this.contractId = contractId;
//    }

    @Basic
    @Column(name = "SUBMIT_USER_ID", nullable = false)
    public int getSubmitUserId() {
        return submitUserId;
    }

    public void setSubmitUserId(int submitUserId) {
        this.submitUserId = submitUserId;
    }

    @Basic
    @Column(name = "SUBMTI_DATE", nullable = false)
    public Timestamp getSubmtiDate() {
        return submtiDate;
    }

    public void setSubmtiDate(Timestamp submtiDate) {
        this.submtiDate = submtiDate;
    }

    @Basic
    @Column(name = "APPROVAL_USER_ID", nullable = true)
    public Integer getApprovalUserId() {
        return approvalUserId;
    }

    public void setApprovalUserId(Integer approvalUserId) {
        this.approvalUserId = approvalUserId;
    }

    @Basic
    @Column(name = "APPROVAL_DATE", nullable = true)
    public Timestamp getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Timestamp approvalDate) {
        this.approvalDate = approvalDate;
    }

    @Basic
    @Column(name = "STATUS", nullable = false)
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ADVICE", nullable = true, length = 255)
    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    @Basic
    //@Temporal(TemporalType.TIMESTAMP)
    @org.hibernate.annotations.Generated(GenerationTime.ALWAYS)
    @Column(name = "CREATE_DATE", nullable = false, insertable = false, updatable = false)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    //@Temporal(TemporalType.TIMESTAMP)
    @org.hibernate.annotations.Generated(GenerationTime.ALWAYS)
    @Column(name = "MODIFICATION_TIME", nullable = false, insertable = false, updatable = false)
    public Timestamp getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Timestamp modificationTime) {
        this.modificationTime = modificationTime;
    }

    @Basic
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "DEL_STATE", nullable = false)
    public DeleteState getDelState() {
        return delState;
    }

    public void setDelState(DeleteState delState) {
        this.delState = delState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractApprovalEntity that = (ContractApprovalEntity) o;

        if (id != that.id) return false;
        if (contractId != that.contractId) return false;
        if (submitUserId != that.submitUserId) return false;
        if (status != that.status) return false;
        if (delState != that.delState) return false;
        if (submtiDate != null ? !submtiDate.equals(that.submtiDate) : that.submtiDate != null) return false;
        if (approvalUserId != null ? !approvalUserId.equals(that.approvalUserId) : that.approvalUserId != null)
            return false;
        if (approvalDate != null ? !approvalDate.equals(that.approvalDate) : that.approvalDate != null) return false;
        if (advice != null ? !advice.equals(that.advice) : that.advice != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modificationTime != null ? !modificationTime.equals(that.modificationTime) : that.modificationTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (contractId ^ (contractId >>> 32));
        result = 31 * result + submitUserId;
        result = 31 * result + (submtiDate != null ? submtiDate.hashCode() : 0);
        result = 31 * result + (approvalUserId != null ? approvalUserId.hashCode() : 0);
        result = 31 * result + (approvalDate != null ? approvalDate.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (advice != null ? advice.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modificationTime != null ? modificationTime.hashCode() : 0);
        result = 31 * result + delState.getValue();
        return result;
    }

    @ManyToOne(targetEntity = ContractEntity.class)
    @JoinColumn(name = "CONTRACT_ID", referencedColumnName = "ID", nullable = false)
    public ContractEntity getContract() {
        return contract;
    }

    public void setContract(ContractEntity contract) {
        this.contract = contract;
    }
}
