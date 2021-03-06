
package com.paydock.javasdk.Models;

import java.math.BigDecimal;
import java.util.Date;

public class SubscriptionSchedule   
{
    public String interval;
    public int frequency;
    public Date start_date = null;
    public Date end_date = null;
    public BigDecimal end_amount_after;
    public BigDecimal end_amount_before;
    public BigDecimal end_amount_total;
    public Integer end_transactions;
}


