package com.saas.saas.constant;

/**
 * Centralized file & storage structure registry.
 * All physical and cloud file paths must be derived from here.
 */
public interface FileConstants {

    /* ─────────── Root Buckets ─────────── */
    String STORAGE_ROOT = "/crm-storage/";
    String TEMP_ROOT = "/crm-temp/";

    /* ─────────── Tenant Scoped Roots ─────────── */
    String TENANT_ROOT = STORAGE_ROOT + "tenants/";
    String TENANT_TEMP_ROOT = TEMP_ROOT + "tenants/";

    /* ─────────── User Files ─────────── */
    String USER_ROOT = "users/";
    String PROFILE_PIC_FOLDER = "profile-pics/";
    String USER_DOCUMENTS = "documents/";
    String USER_ATTACHMENTS = "attachments/";

    /* ─────────── CRM Core Files ─────────── */
    String LEAD_ATTACHMENTS = "lead-attachments/";
    String DEAL_ATTACHMENTS = "deal-attachments/";
    String ACTIVITY_ATTACHMENTS = "activity-attachments/";

    /* ─────────── System / Exports ─────────── */
    String EXPORTS = "exports/";
    String REPORTS = "reports/";
    String INVOICES = "invoices/";

    /* ─────────── Backup / Logs ─────────── */
    String BACKUPS = "backups/";
    String SYSTEM_LOGS = "system-logs/";

    /* ─────────── File Extensions ─────────── */
    String EXT_PDF = ".pdf";
    String EXT_XLSX = ".xlsx";
    String EXT_CSV = ".csv";
    String EXT_PNG = ".png";
    String EXT_JPG = ".jpg";
}

