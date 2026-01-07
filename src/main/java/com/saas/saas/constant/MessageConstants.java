package com.saas.saas.constant;

/**
 * Centralized user-facing message registry.
 * All API success & failure messages must originate from here.
 */
public interface MessageConstants {

    /* ─────────── Common ─────────── */
    String OPERATION_SUCCESS = "Operation completed successfully.";
    String OPERATION_FAILED = "Operation failed. Please try again.";
    String INVALID_REQUEST = "Invalid request parameters.";

    /* ─────────── Authentication ─────────── */
    String LOGIN_SUCCESS = "Login successful.";
    String LOGIN_FAILED = "Invalid email or password.";
    String LOGOUT_SUCCESS = "Logged out successfully.";
    String TOKEN_EXPIRED = "Session expired. Please login again.";
    String OTP_SENT = "OTP has been sent to your registered contact.";
    String OTP_VERIFIED = "OTP verified successfully.";

    /* ─────────── User ─────────── */
    String USER_CREATED = "User created successfully.";
    String USER_UPDATED = "User updated successfully.";
    String USER_DELETED = "User deleted successfully.";
    String USER_NOT_FOUND = "User not found.";

    /* ─────────── Tenant / Organization ─────────── */
    String TENANT_CREATED = "Organization created successfully.";
    String TENANT_UPDATED = "Organization updated successfully.";
    String TENANT_SUSPENDED = "Your organization has been suspended.";

    /* ─────────── Leads / CRM Core ─────────── */
    String LEAD_CREATED = "Lead created successfully.";
    String LEAD_UPDATED = "Lead updated successfully.";
    String LEAD_DELETED = "Lead deleted successfully.";
    String LEAD_ASSIGNED = "Lead assigned successfully.";

    /* ─────────── Deals / Pipeline ─────────── */
    String DEAL_CREATED = "Deal created successfully.";
    String DEAL_STAGE_UPDATED = "Deal stage updated successfully.";
    String DEAL_WON = "Deal marked as WON 🎉";
    String DEAL_LOST = "Deal marked as LOST.";

    /* ─────────── Subscription / Billing ─────────── */
    String SUBSCRIPTION_ACTIVATED = "Subscription activated successfully.";
    String PAYMENT_SUCCESS = "Payment received successfully.";
    String PAYMENT_FAILED = "Payment failed. Please try again.";

    /* ─────────── File Upload ─────────── */
    String FILE_UPLOADED = "File uploaded successfully.";
    String FILE_TOO_LARGE = "File size exceeds the allowed limit.";
    String INVALID_FILE_TYPE = "Invalid file format.";
}
