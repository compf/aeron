public class SnapshotMarkData {
    private final long snapshotTypeId;
    private final long logPosition;
    private final long leadershipTermId;
    private final int snapshotIndex;
    private final TimeUnit timeUnit;
    private final int appVersion;

    public SnapshotMarkData(
        final long snapshotTypeId,
        final long logPosition,
        final long leadershipTermId,
        final int snapshotIndex,
        final TimeUnit timeUnit,
        final int appVersion) {
        this.snapshotTypeId = snapshotTypeId;
        this.logPosition = logPosition;
        this.leadershipTermId = leadershipTermId;
        this.snapshotIndex = snapshotIndex;
        this.timeUnit = timeUnit;
        this.appVersion = appVersion;
    }

    public long getSnapshotTypeId() {
        return snapshotTypeId;
    }

    public long getLogPosition() {
        return logPosition;
    }

    public long getLeadershipTermId() {
        return leadershipTermId;
    }

    public int getSnapshotIndex() {
        return snapshotIndex;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public int getAppVersion() {
        return appVersion;
    }
}