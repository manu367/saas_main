package com.saas.saas.constant;

/**
 * All system permissions for CRM SaaS platform.
 * Used for RBAC & ABAC enforcement.
 */
public enum PermissionConstants {

    /* ─────────── Common ─────────── */
    VIEW_DASHBOARD,
    ACCESS_REPORTS,

    /* ─────────── User Management ─────────── */
    USER_CREATE,
    USER_READ,
    USER_UPDATE,
    USER_DELETE,
    USER_RESET_PASSWORD,
    USER_ASSIGN_ROLE,

    /* ─────────── Organization / Tenant ─────────── */
    TENANT_CREATE,
    TENANT_READ,
    TENANT_UPDATE,
    TENANT_DELETE,
    TENANT_SUSPEND,
    TENANT_RESTORE,

    /* ─────────── Leads ─────────── */
    LEAD_CREATE,
    LEAD_READ,
    LEAD_UPDATE,
    LEAD_DELETE,
    LEAD_ASSIGN,
    LEAD_IMPORT,
    LEAD_EXPORT,

    /* ─────────── Deals / Opportunities ─────────── */
    DEAL_CREATE,
    DEAL_READ,
    DEAL_UPDATE,
    DEAL_DELETE,
    DEAL_STAGE_CHANGE,
    DEAL_CLOSE_WON,
    DEAL_CLOSE_LOST,

    /* ─────────── Activities / Tasks ─────────── */
    TASK_CREATE,
    TASK_READ,
    TASK_UPDATE,
    TASK_DELETE,

    /* ─────────── Files & Attachments ─────────── */
    FILE_UPLOAD,
    FILE_DOWNLOAD,
    FILE_DELETE,

    /* ─────────── Billing / Subscription ─────────── */
    SUBSCRIPTION_VIEW,
    SUBSCRIPTION_UPDATE,
    PAYMENT_VIEW,
    PAYMENT_INITIATE,

    /* ─────────── System / Config ─────────── */
    SYSTEM_SETTINGS_VIEW,
    SYSTEM_SETTINGS_UPDATE,
    AUDIT_LOG_VIEW,
    INTEGRATION_MANAGE
}
