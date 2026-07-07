package com.qcwireless.qcwatch.base.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class ShellUtils {
    public static final java.lang.String COMMAND_EXIT = "exit\n";
    public static final java.lang.String COMMAND_LINE_END = "\n";
    public static final java.lang.String COMMAND_SH = "sh";
    public static final java.lang.String COMMAND_SU = "su";
    private static final java.lang.String TAG = "ShellUtils";

    private ShellUtils() {
        throw new java.lang.AssertionError();
    }

    public static boolean checkRootPermission() {
        return execCommand("echo root", true, false).result == 0;
    }

    public static com.qcwireless.qcwatch.base.utils.ShellUtils.CommandResult execCommand(java.lang.String command, boolean isRoot) {
        return execCommand(new java.lang.String[]{command}, isRoot, true);
    }

    public static com.qcwireless.qcwatch.base.utils.ShellUtils.CommandResult execCommand(java.util.List<java.lang.String> commands, boolean isRoot) {
        return execCommand(commands == null ? null : (java.lang.String[]) commands.toArray(new java.lang.String[0]), isRoot, true);
    }

    public static com.qcwireless.qcwatch.base.utils.ShellUtils.CommandResult execCommand(java.lang.String[] commands, boolean isRoot) {
        return execCommand(commands, isRoot, true);
    }

    public static com.qcwireless.qcwatch.base.utils.ShellUtils.CommandResult execCommand(java.lang.String command, boolean isRoot, boolean isNeedResultMsg) {
        return execCommand(new java.lang.String[]{command}, isRoot, isNeedResultMsg);
    }

    public static com.qcwireless.qcwatch.base.utils.ShellUtils.CommandResult execCommand(java.util.List<java.lang.String> commands, boolean isRoot, boolean isNeedResultMsg) {
        return execCommand(commands == null ? null : (java.lang.String[]) commands.toArray(new java.lang.String[0]), isRoot, isNeedResultMsg);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(4:6|7|(1:9)(1:163)|10)|(7:12|13|14|15|(3:17|(2:19|20)(2:22|23)|21)|24|25)|(19:48|49|50|51|52|53|55|56|(3:57|58|(1:60)(1:61))|(2:62|(1:64)(0))|29|(1:31)|(1:33)|(1:36)|37|(1:39)(1:45)|(1:41)|42|43)(1:27)|28|29|(0)|(0)|(0)|37|(0)(0)|(0)|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x014d, code lost:
    
        if (r10 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        r2.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0171, code lost:
    
        if (r10 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0173, code lost:
    
        r10.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0176, code lost:
    
        r8 = r9;
        r10 = r1;
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019d A[Catch: IOException -> 0x0199, TryCatch #8 {IOException -> 0x0199, blocks: (B:122:0x0195, B:110:0x019d, B:112:0x01a2), top: B:121:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a2 A[Catch: IOException -> 0x0199, TRY_LEAVE, TryCatch #8 {IOException -> 0x0199, blocks: (B:122:0x0195, B:110:0x019d, B:112:0x01a2), top: B:121:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee A[Catch: IOException -> 0x00f7, TryCatch #0 {IOException -> 0x00f7, blocks: (B:29:0x00e9, B:31:0x00ee, B:33:0x00f3), top: B:28:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3 A[Catch: IOException -> 0x00f7, TRY_LEAVE, TryCatch #0 {IOException -> 0x00f7, blocks: (B:29:0x00e9, B:31:0x00ee, B:33:0x00f3), top: B:28:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165 A[Catch: IOException -> 0x0161, TryCatch #19 {IOException -> 0x0161, blocks: (B:87:0x015d, B:74:0x0165, B:76:0x016a), top: B:86:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016a A[Catch: IOException -> 0x0161, TRY_LEAVE, TryCatch #19 {IOException -> 0x0161, blocks: (B:87:0x015d, B:74:0x0165, B:76:0x016a), top: B:86:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0141 A[Catch: IOException -> 0x013d, TryCatch #7 {IOException -> 0x013d, blocks: (B:105:0x0139, B:96:0x0141, B:98:0x0146), top: B:104:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0146 A[Catch: IOException -> 0x013d, TRY_LEAVE, TryCatch #7 {IOException -> 0x013d, blocks: (B:105:0x0139, B:96:0x0141, B:98:0x0146), top: B:104:0x0139 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.qcwireless.qcwatch.base.utils.ShellUtils.CommandResult execCommand(java.lang.String[] r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.base.utils.ShellUtils.execCommand(java.lang.String[], boolean, boolean):com.qcwireless.qcwatch.base.utils.ShellUtils$CommandResult");
    }

    public static class CommandResult {
        public java.lang.String errorMsg;
        public int result;
        public java.lang.String successMsg;

        public CommandResult(int result) {
            this.result = result;
        }

        public CommandResult(int result, java.lang.String successMsg, java.lang.String errorMsg) {
            this.result = result;
            this.successMsg = successMsg;
            this.errorMsg = errorMsg;
        }
    }
}
