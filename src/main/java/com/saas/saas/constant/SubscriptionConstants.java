package com.saas.saas.constant;

/**
 * Subscription plan hierarchy for CRM SaaS platform.
 * Defines commercial tiers and feature ceilings.
 */
public enum SubscriptionConstants {

    /* ─────────── Entry Tier ─────────── */
    FREE(
            1,      // max workspaces
            3,      // max users
            100,    // max leads
            false,  // automation
            false   // reporting
    ),

    /* ─────────── Growth Tier ─────────── */
    PRO(
            5,
            25,
            10_000,
            true,
            true
    ),

    /* ─────────── Business Tier ─────────── */
    ENTERPRISE(
            20,
            100,
            100_000,
            true,
            true
    ),

    /* ─────────── Negotiated Tier ─────────── */
    CUSTOM(
            Integer.MAX_VALUE,
            Integer.MAX_VALUE,
            Integer.MAX_VALUE,
            true,
            true
    );

    public final int maxWorkspaces;
    public final int maxUsers;
    public final int maxLeads;
    public final boolean automationEnabled;
    public final boolean reportingEnabled;

    SubscriptionConstants(int maxWorkspaces,
                          int maxUsers,
                          int maxLeads,
                          boolean automationEnabled,
                          boolean reportingEnabled) {
        this.maxWorkspaces = maxWorkspaces;
        this.maxUsers = maxUsers;
        this.maxLeads = maxLeads;
        this.automationEnabled = automationEnabled;
        this.reportingEnabled = reportingEnabled;
    }
}
