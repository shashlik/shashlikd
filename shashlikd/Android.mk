LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE_TAGS := optional

LOCAL_AIDL_INCLUDES := $(LOCAL_PATH)/src/java

LOCAL_SRC_FILES := $(call all-java-files-under, java)

# LOCAL_STATIC_JAVA_LIBRARIES := Keyguard
LOCAL_JAVA_LIBRARIES := telephony-common

LOCAL_OVERRIDES_PACKAGES := SystemUI Home Launcher2 Calculator BasicDreams Calendar PrintSpooler

LOCAL_PACKAGE_NAME := Shashlikd
LOCAL_CERTIFICATE := platform
LOCAL_PRIVILEGED_MODULE := true

#
# LOCAL_RESOURCE_DIR := \
#     frameworks/base/packages/Keyguard/res \
#     $(LOCAL_PATH)/res
# LOCAL_AAPT_FLAGS := --auto-add-overlay --extra-packages com.android.keyguard

include $(BUILD_PACKAGE)

include $(call all-makefiles-under,$(LOCAL_PATH))
