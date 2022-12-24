package constants;

public class ApiConstants {

    private static final String SANDBOX_URL;
    private static final String DEV_URL;
    public static final String PRODUCT_LIST_API_V3;
    public static final String X_API_CODE;
    public static final String X_MARKET;
    public static final String ACCEPT_LANGUAGE;
    public static final int SUCCESS;
    public static final String CATEGORY;
    public static final String CATEGORY_ID;
    public static final String SORTING;
    public static final String PRICE;
    public static final String DATE_ADDED;
    public static final String INVALID_SORT_OPTION;
    public static final String DIRECTION;
    public static final String DESC;
    public static final String ASC;
    public static final String PAGE;
    public static final int PAGE_ONE;
    public static final String LIMIT;
    public static final int LIMIT_VALUE;
    public static final int PAGE_TWO;
    public static final int LIMIT_51;
    public static final int ERROR_422;
    public static final int PAGE_MINUS;
    public static final String CHARACTER;
    public static final String COLOR;
    public static final String SIZE;
    public static final int ERROR_401;
    public static final int ERROR_404;
    public static final String ADD_TO_CART_API;
    public static final String TOKEN;
    public static final String GET_USER_INFO_API;
    public static final String EMAIL;
    public static final String Session_API;
    public static final String PRODUCT_BY_ID_API;
    public static final String STORE_BY_ID_API;
    public static final String LOGIN_API;
    public static final String ADD_TO_WISHLIST_API;
    public static final String ACCEPT_LANGUAGE_AR;
    public static final String GET_WISHLIST_API;
    public static final String GET_WISHLIST_FILTER_API;
    public static final String COMPARISON_LIST_API;
    public static final String ADDRESSES_API;
    public static final String UPDATE_USER_INFO_API;
    public static final String UPDATE_USER_INFO_SUCCESS_MSG;
    public static final String PARTNER_CONNECT_API;
    public static final String TRUE;
    public static final String FALSE;
    public static final String PARTNER_CONNECT_VALIDATION_MSG;
    public static final String UPDATE_CART_API;
    public static final String DELETE_CART_API;
    public static final String GET_CART_API;
    public static final String MARKET_CURRENCY_API;
    public static final String CURRENCY;
    public static final String FILTERS_API;
    public static final String SOMETHING_WENT_WRONG_MSG;
    public static final String COUNT_API;
    public static final String MERGE_API;
    public static final String QUANTITY;
    public static final String OPTIONS;
    public static final String DELETE_WISH_LIST_API;
    public static final String PRODUCT_OPTIONS_API;
    public static final String POST_CUSTOMER_API;
    public static final String TENANT_SECRET_KEY;
    public static final String POST_BRAND_API;
    public static final int CREATED;
    public static final String POST_UNIT_API;
    public static final String MALL_NAME;
    public static final String TRACKING_API;
    public static final String SIZE_CHART_API;
    public static final String COMPLEMENTARY_PRODUCTS_API;
    public static final String SIMILAR_PRODUCT_API;
    public static final String STORE;
    public static final String MARKET;
    public static String STORE_ID;
    public static final String IS_FEATURED;
    public static final int IS_FEATURED_ENABLED;
    public static final int IS_FEATURED_DISABLE;
    public static final String GENDER;
    public static final String APPOINTMENT_API;
    public static final String REASON_API;
    public static final String STORE_POLICY_API;
    public static final String PRODUCT_FILTER_API;
    public static final String CREATE_ORDER_API;
    public static final String CATEGORIES_API;
    public static final int ORDER_STATUS_PAYMENT_PROCESSING_ID;
    public static final String ORDER_STATUS_PAYMENT_PROCESSING_SLUG;
    public static final String ORDER_STATUS_PAYMENT_PROCESSING;
    public static final int ORDER_STATUS_ORDER_PLACED_ID;
    public static final String ORDER_STATUS_ORDER_PLACED_SLUG;
    public static final String ORDER_STATUS_ORDER_PLACED;
    public static final String ORDER_STATUS_ORDER_REJECTED;
    public static final int SUB_ORDER_STATUS_PAYMENT_PROCESSING_ID;
    public static final String SUB_ORDER_STATUS_PAYMENT_PROCESSING_SLUG;
    public static final String SUB_ORDER_STATUS_PAYMENT_PROCESSING;
    public static final String DELIVERY_METHOD_CLICK_AND_COLLECT;
    public static final String DELIVERY_SLUG_CLICK_AND_COLLECT;
    public static final String PRODUCT_ORDER_STATUS_PAYMENT_PROCESSING;
    public static final String PRODUCT_ORDER_STATUS_PAYMENT_PROCESSING_SLUG;
    public static final int PRODUCT_ORDER_STATUS_PAYMENT_PROCESSING_ID;
    public static final String ORDER_DETAILS_API;
    public static final String ORDER_LIST_API;
    public static String CANCEL_ORDER_API;
    public static String CANCEL_SUB_ORDER_API;
    public static String ReOrder_API;
    public static String CANCEL_ORDER_SUCCESS_MSG;
    public static String CANCEL_SUB_ORDER_SUCCESS_MSG;
    public static final int ORDER_STATUS_CANCELLED_ID;
    public static final String ORDER_STATUS_CANCELLED_SLUG;
    public static final String ORDER_STATUS_CANCELLED;
    public static final String SUB_ORDER_STATUS_CANCELLED;
    public static final String PRODUCT_ORDER_STATUS_CANCELLED;
    public static String CANCEL_ITEM_API;
    public static final String CLOSED_ORDER_SITE;
    public static final String CLOSED_ORDER_API;
    public static final String PROCESSING_ORDER_SITE;
    public static final String ORDER_STATUS_COLLECTED;
    public static final String PREPARE_ORDER_SITE;
    public static final String PRODUCT_STATUS_READY_TO_SHIP_SLUG;
    public static final String PRODUCT_STATUS_READY_TO_SHIP_NAME;
    public static final String ORDER_STATUS_READY_TO_SHIP_SLUG;
    public static final String ORDER_STATUS_READY_TO_SHIP_NAME;
    public static final String SUB_ORDER_STATUS_READY_TO_SHIP_SLUG;
    public static final String SUB_ORDER_STATUS_READY_TO_SHIP_NAME;
    public static final String SUB_ORDER_STATUS_UPDATE_ARAMEX;
    public static final String READY_FOR_DELIVERY;
    public static final String SHIPPED;
    public static final String DELIVERED;
    public static final String SUB_ORDER_STATUS_READY_FOR_DELIVERY_NAME;
    public static final String SUB_ORDER_STATUS_SHIPPED_NAME;
    public static final String SUB_ORDER_STATUS_DELIVERED_NAME;
    public static final String ORDER_STATUS_DELIVERED_NAME;
    public static final String ORDER_STATUS_DELIVERED_SLUG;
    public static final String ARAMEX_SECRET_KEY;
    public static String POST_INVOICE;
    public static String RETURN_REQUEST_API;
    public static String IN_STORE;
    public static String ONLINE;
    public static String UPDATE_RETURN_BY_ARAMEX_API;
    public static final String PRODUCT_STATUS_RETURN_COLLECTED_NAME;
    public static final String ORDER_EMPTY_CART_ERROR_MSG;


    static {

        SANDBOX_URL = "https://maf-holding-sandbox.apigee.net/marketplace";
        DEV_URL = "https://maf-properties-dev.apigee.net/smbu";
        PRODUCT_LIST_API_V3 = DEV_URL + "/v3/product";
        X_API_CODE = "CRyct8EMgZmJLTFdSVkAAFSq1heAoizN";
        X_MARKET = "moe";
        ACCEPT_LANGUAGE = "en-gb";
        SUCCESS = 200;
        CATEGORY = "category";
        SORTING = "sorting";
        DIRECTION = "direction";
        DESC = "desc";
        ASC = "desc";
        PRICE = "price";
        PAGE = "page";
        LIMIT = "limit";
        PAGE_ONE = 1;
        LIMIT_VALUE = 1;
        PAGE_TWO = 2;
        LIMIT_51 = 51;
        ERROR_422 = 422;
        PAGE_MINUS = -1;
        CHARACTER = "test";
        COLOR = "color";
        SIZE = "size";
        DATE_ADDED = "date_added";
        INVALID_SORT_OPTION = "invalid sort option";
        ERROR_401 = 401;
        ERROR_404 = 404;
        ADD_TO_CART_API = DEV_URL + "/v1/cart";
        TOKEN = "";
        GET_USER_INFO_API = DEV_URL + "/auth0/user";
        EMAIL = "email";
        Session_API = DEV_URL + "/v1/sessions";
        PRODUCT_BY_ID_API = DEV_URL + "/v2/product/";
        STORE_BY_ID_API = DEV_URL + "/v1/store/";
        LOGIN_API = "https://sit.maf-dev.auth0.com/oauth/token";
        ADD_TO_WISHLIST_API = DEV_URL + "/v1/wishlist";
        ACCEPT_LANGUAGE_AR = "ar-ar";
        GET_WISHLIST_API = DEV_URL + "/v1/wishlist?limit=50";
        GET_WISHLIST_FILTER_API = DEV_URL + "/v1/wishlist/products";
        COMPARISON_LIST_API = DEV_URL + "/v1/comparison-list/";
        ADDRESSES_API = "http://34.245.167.249/sharedapi/v1/addresses";
        UPDATE_USER_INFO_API = DEV_URL + "/v1/mpass/user";
        UPDATE_USER_INFO_SUCCESS_MSG = "Updated User Successfully";
        PARTNER_CONNECT_API = DEV_URL + "/v1/user";
        TRUE = "true";
        FALSE = "false";
        PARTNER_CONNECT_VALIDATION_MSG = "The email or key you entered is incorrect";
        UPDATE_CART_API = DEV_URL + "/v1/cart/";
        MARKET_CURRENCY_API = DEV_URL + "/v1/market";
        CURRENCY = "AED";
        FILTERS_API = DEV_URL + "/v1/filters";
        DELETE_CART_API = DEV_URL + "/v1/cart/";
        SOMETHING_WENT_WRONG_MSG = "Something went wrong";
        COUNT_API = DEV_URL + "/v1/user/counts";
        MERGE_API = DEV_URL + "/v1/user/logged-in";
        QUANTITY = "quantity";
        OPTIONS = "options";
        DELETE_WISH_LIST_API = DEV_URL + "/v1/wishlist/";
        PRODUCT_OPTIONS_API = DEV_URL + "/v2/product/";
        POST_CUSTOMER_API = DEV_URL + "/v1/webhooks/customer";
        TENANT_SECRET_KEY = "SECDEV5WQxZdNNk2";
        POST_BRAND_API = DEV_URL + "/v1/webhooks/brand";
        CREATED = 201;
        POST_UNIT_API = DEV_URL + "/v1/webhooks/unit";
        MALL_NAME = "Mall of the Emirates";
        TRACKING_API = DEV_URL + "/v1/product/tracking";
        SIZE_CHART_API = DEV_URL + "/v1/product/";
        COMPLEMENTARY_PRODUCTS_API = DEV_URL + "/v1/product/";
        SIMILAR_PRODUCT_API = DEV_URL + "/v1/product/";
        STORE = "store";
        MARKET = "market";
        STORE_ID = "store_id";
        CATEGORY_ID = "category_id";
        IS_FEATURED = "is_featured";
        IS_FEATURED_ENABLED = 1;
        IS_FEATURED_DISABLE = 0;
        GENDER = "gender";
        APPOINTMENT_API = DEV_URL + "/v1/appointment";
        REASON_API = DEV_URL + "/v1/reasons";
        STORE_POLICY_API = DEV_URL + "/v1/store/***/policy";
        PRODUCT_FILTER_API = DEV_URL + "/v1/filters";
        CREATE_ORDER_API = DEV_URL + "/v1/order";
        GET_CART_API = DEV_URL + "/v1/cart/";
        CATEGORIES_API = DEV_URL + "/v1/categories";
        ORDER_STATUS_PAYMENT_PROCESSING_ID = 30;
        ORDER_STATUS_PAYMENT_PROCESSING_SLUG = "paymentProcessing";
        ORDER_STATUS_PAYMENT_PROCESSING = "Processing Payment";
        ORDER_STATUS_ORDER_PLACED_ID = 2;
        ORDER_STATUS_ORDER_PLACED_SLUG = "orderPlaced";
        ORDER_STATUS_ORDER_PLACED = "Order Placed";
        SUB_ORDER_STATUS_PAYMENT_PROCESSING_ID = 47;
        SUB_ORDER_STATUS_PAYMENT_PROCESSING_SLUG = "paymentProcessing";
        SUB_ORDER_STATUS_PAYMENT_PROCESSING = "Processing Payment";
        DELIVERY_METHOD_CLICK_AND_COLLECT = "Click And Collect";
        DELIVERY_SLUG_CLICK_AND_COLLECT = "clickAndCollect";
        PRODUCT_ORDER_STATUS_PAYMENT_PROCESSING_ID = 46;
        PRODUCT_ORDER_STATUS_PAYMENT_PROCESSING_SLUG = "paymentProcessing";
        PRODUCT_ORDER_STATUS_PAYMENT_PROCESSING = "Processing Payment";
        ORDER_DETAILS_API = DEV_URL + "/v1/order/";
        ORDER_LIST_API = DEV_URL + "/v1/order";
        CANCEL_ORDER_SUCCESS_MSG = "Order is canceled successfully.";
        CANCEL_SUB_ORDER_SUCCESS_MSG = "Suborder is canceled successfully.";
        ORDER_STATUS_CANCELLED_ID = 8;
        ORDER_STATUS_CANCELLED_SLUG = "orderCancelled";
        ORDER_STATUS_CANCELLED = "Cancelled";
        SUB_ORDER_STATUS_CANCELLED = "Cancelled";
        PRODUCT_ORDER_STATUS_CANCELLED = "Cancelled";
        ORDER_STATUS_ORDER_REJECTED = "Payment Unsuccessful";
        CLOSED_ORDER_SITE = "Unavailable";
        CLOSED_ORDER_API = "orderClosed";
        PROCESSING_ORDER_SITE = "Processing Order";
        ORDER_STATUS_COLLECTED = "Collected";
        PREPARE_ORDER_SITE = "Processing Order";
        PRODUCT_STATUS_READY_TO_SHIP_SLUG = "readyToShip";
        PRODUCT_STATUS_READY_TO_SHIP_NAME = "Preparing Order";
        ORDER_STATUS_READY_TO_SHIP_SLUG = "orderInProgress";
        ORDER_STATUS_READY_TO_SHIP_NAME = "Processing Order";
        SUB_ORDER_STATUS_READY_TO_SHIP_SLUG = "readyToShip";
        SUB_ORDER_STATUS_READY_TO_SHIP_NAME = "Preparing Order";
        SUB_ORDER_STATUS_UPDATE_ARAMEX = DEV_URL + "/v1/webhooks/aramex/status";
        READY_FOR_DELIVERY = "out_for_delivery";
        SHIPPED = "picked_up";
        DELIVERED = "delivered";
        SUB_ORDER_STATUS_READY_FOR_DELIVERY_NAME = "Out for Delivery";
        SUB_ORDER_STATUS_SHIPPED_NAME = "Ready for Delivery";
        SUB_ORDER_STATUS_DELIVERED_NAME = "Delivered";
        ORDER_STATUS_DELIVERED_NAME = "Delivered";
        ORDER_STATUS_DELIVERED_SLUG = "orderCompleted";
        ARAMEX_SECRET_KEY = "C5BB6D3AEC6B4A7C";
        IN_STORE = "in_store";
        ONLINE = "online";
        UPDATE_RETURN_BY_ARAMEX_API = DEV_URL + "/v1/webhooks/aramex/return";
        PRODUCT_STATUS_RETURN_COLLECTED_NAME = "Return Collected";
        ORDER_EMPTY_CART_ERROR_MSG = "Sorry. You cannot proceed with your order. Kindly check your cart and try again.";
    }

    public static void setCancelOrderApiUrl(String orderId) {

        CANCEL_ORDER_API = DEV_URL + "/v1/order/" + orderId + "/cancel";
    }

    public static void setCancelSubOrderApiUrl(String orderId, String subOrderId) {

        CANCEL_SUB_ORDER_API = DEV_URL + "/v1/order/" + orderId + "/suborder/" + subOrderId + "/cancel";
    }

    public static void setCancelItemApiUrl(String orderId) {

        CANCEL_ITEM_API = DEV_URL + "/v1/order/" + orderId + "/items/cancel";
    }

    public static void setReOrderApiUrl(String orderId) {

        ReOrder_API = DEV_URL + "/v1/order/" + orderId;
    }

    public static void setPostInvoice(String orderId) {

        POST_INVOICE = DEV_URL + "/v1/order/" + orderId + "/invoices";
    }

    public static void setReturnRequest(String orderId) {

        RETURN_REQUEST_API = DEV_URL + "/v1/order/" + orderId + "/items/return";
    }
}
