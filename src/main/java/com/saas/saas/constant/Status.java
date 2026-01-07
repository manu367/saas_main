package com.saas.saas.constant;

/**
 * Unified lifecycle statuses for CRM SaaS platform.
 * Used across approvals, leads, payments, onboarding & workflows.
 */
public enum Status {

    /* ─────────── Initial / Draft ─────────── */
    DRAFT,              // created but not yet submitted

    /* ─────────── Review & Approval ─────────── */
    PENDING_APPROVAL,
    APPROVED,
    REJECTED,
    ON_HOLD,

    /* ─────────── Processing ─────────── */
    IN_PROGRESS,
    PROCESSED,
    QUEUED,

    /* ─────────── Completion ─────────── */
    COMPLETED,
    CLOSED,

    /* ─────────── Payment / Billing ─────────── */
    PAYMENT_PENDING,
    PAYMENT_FAILED,
    PAID,
    REFUNDED,

    /* ─────────── System / Account ─────────── */
    ACTIVE,
    INACTIVE,
    SUSPENDED,
    EXPIRED,

    /* ─────────── CRM Specific ─────────── */
    WON,
    LOST,
    ARCHIVED,
    DELETED
}
