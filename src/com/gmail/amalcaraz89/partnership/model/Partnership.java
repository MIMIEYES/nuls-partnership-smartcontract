package com.gmail.amalcaraz89.partnership.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public class Partnership extends PartnershipResume {

    private BigInteger totalPayoutsAmount = BigInteger.ZERO;
    //private List<Partner> partners = new ArrayList<Partner>();
    //private List<Payout> lastPayouts = new ArrayList<Payout>();
    private LinkedHashMap<String, Partner> partners = new LinkedHashMap<>();
    private LinkedHashMap<Long, Payout> lastPayouts = new LinkedHashMap<>();

    public Partnership(String title, String desc, double nodeCommission, long payoutInterval) {
        super(title, desc, nodeCommission, payoutInterval);
    }

    public BigInteger getTotalPayoutsAmount() { return totalPayoutsAmount; }

    public void setTotalPayoutsAmount(BigInteger totalPayoutsAmount) { this.totalPayoutsAmount = totalPayoutsAmount; }

    public Collection<Partner> getPartnerList() { return partners != null ? partners.values() : null; }

    public Collection<Payout> getLastPayoutList() { return lastPayouts != null ? lastPayouts.values() : null; }

    public LinkedHashMap<String, Partner> getPartners() {
        return partners;
    }

    public void setPartners(LinkedHashMap<String, Partner> partners) {
        this.partners = partners;
    }

    public LinkedHashMap<Long, Payout> getLastPayouts() {
        return lastPayouts;
    }

    public void setLastPayouts(LinkedHashMap<Long, Payout> lastPayouts) {
        this.lastPayouts = lastPayouts;
    }



}
