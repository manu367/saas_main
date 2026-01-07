package com.saas.saas.constant;

/**
 * Centralized HTTP header registry for CRM SaaS platform.
 * All inbound & outbound custom headers must be defined here.
 */
public interface HeaderConstants {

    /* ─────────── Tenant & Org Context ─────────── */
    String TENANT_ID = "X-Tenant-Id";
    String ORGANIZATION_ID = "X-Org-Id";
    String WORKSPACE_ID = "X-Workspace-Id";

    /* ─────────── Security & Auth ─────────── */
    String AUTHORIZATION = "Authorization";
    String TOKEN_TYPE = "Bearer";
    String API_KEY = "X-Api-Key";

    /* ─────────── Request Tracing ─────────── */
    String REQUEST_ID = "X-Request-Id";
    String CORRELATION_ID = "X-Correlation-Id";
    String CLIENT_IP = "X-Client-IP";
    String USER_AGENT = "User-Agent";

    /* ─────────── Localization ─────────── */
    String LOCALE = "X-Locale";
    String TIMEZONE = "X-Timezone";

    /* ─────────── File & Download ─────────── */
    String FILE_NAME = "X-File-Name";
    String FILE_SIZE = "X-File-Size";

    /* ─────────── Feature & Versioning ─────────── */
    String API_VERSION = "X-Api-Version";
    String CLIENT_VERSION = "X-Client-Version";
}
