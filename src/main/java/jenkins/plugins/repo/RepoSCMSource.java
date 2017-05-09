package jenkins.plugins.repo;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

import javax.annotation.CheckForNull;
import java.util.Collections;
import java.util.Set;

public class RepoSCMSource extends AbstractRepoSCMSource {

    private final String manifestRepositoryUrl;

    private final String includes;

    private final String excludes;

    // Advanced Fields:
    @CheckForNull
    private String manifestFile;
    @CheckForNull private String manifestGroup;
    @CheckForNull private String repoUrl;
    @CheckForNull private String mirrorDir;
    @CheckForNull private String manifestBranch;
    @CheckForNull private int jobs;
    @CheckForNull private int depth;
    @CheckForNull private String localManifest;
    @CheckForNull private String destinationDir;
    @CheckForNull private boolean currentBranch;
    @CheckForNull private boolean resetFirst;
    @CheckForNull private boolean quiet;
    @CheckForNull private boolean forceSync;
    @CheckForNull private boolean trace;
    @CheckForNull private boolean showAllChanges;
    @CheckForNull private boolean noTags;
    @CheckForNull private Set<String> ignoreProjects;

    public RepoSCMSource(String id, String manifestRepositoryUrl, String includes, String excludes) {
        this(id, manifestRepositoryUrl, includes, excludes, null, null,
                null, null, null, 0,
                0, null, null, false,
                false, false, false, false,
                false, false, Collections.<String>emptySet());
    }

    @DataBoundConstructor
    public RepoSCMSource(String id, String manifestRepositoryUrl, String includes,
                         String excludes, String manifestFile, String manifestGroup,
                         String repoUrl, String mirrorDir, String manifestBranch,
                         int jobs, int depth, String localManifest, String destinationDir,
                         boolean currentBranch, boolean resetFirst, boolean quiet,
                         boolean forceSync, boolean trace, boolean showAllChanges,
                         boolean noTags, Set<String> ignoreProjects) {
        super(id);
        this.manifestRepositoryUrl = manifestRepositoryUrl;
        this.includes = includes;
        this.excludes = excludes;
        this.manifestFile = manifestFile;
        this.manifestGroup = manifestGroup;
        this.repoUrl = repoUrl;
        this.mirrorDir = mirrorDir;
        this.manifestBranch = manifestBranch;
        this.jobs = jobs;
        this.depth = depth;
        this.localManifest = localManifest;
        this.destinationDir = destinationDir;
        this.currentBranch = currentBranch;
        this.resetFirst = resetFirst;
        this.quiet = quiet;
        this.forceSync = forceSync;
        this.trace = trace;
        this.showAllChanges = showAllChanges;
        this.noTags = noTags;
        this.ignoreProjects = ignoreProjects;
    }

    @Override
    public String getManifestRepositoryUrl() {
        return manifestRepositoryUrl;
    }

    @Override
    public String getIncludes() {
        return includes;
    }

    @Override
    public String getExcludes() {
        return excludes;
    }

    @Override
    public String getManifestFile() {
        return manifestFile;
    }

    @DataBoundSetter
    public void setManifestFile(String manifestFile) {
        this.manifestFile = manifestFile;
    }

    @Override
    public String getManifestGroup() {
        return manifestGroup;
    }

    @DataBoundSetter
    public void setManifestGroup(String manifestGroup) {
        this.manifestGroup = manifestGroup;
    }

    @Override
    public String getRepoUrl() {
        return repoUrl;
    }

    @DataBoundSetter
    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    @Override
    public String getMirrorDir() {
        return mirrorDir;
    }

    @DataBoundSetter
    public void setMirrorDir(String mirrorDir) {
        this.mirrorDir = mirrorDir;
    }

    @Override
    public String getManifestBranch() {
        return manifestBranch;
    }

    @DataBoundSetter
    public void setManifestBranch(String manifestBranch) {
        this.manifestBranch = manifestBranch;
    }

    @Override
    public int getJobs() {
        return jobs;
    }

    @DataBoundSetter
    public void setJobs(int jobs) {
        this.jobs = jobs;
    }

    @Override
    public int getDepth() {
        return depth;
    }

    @DataBoundSetter
    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String getLocalManifest() {
        return localManifest;
    }

    @DataBoundSetter
    public void setLocalManifest(String localManifest) {
        this.localManifest = localManifest;
    }

    @Override
    public String getDestinationDir() {
        return destinationDir;
    }

    @DataBoundSetter
    public void setDestinationDir(String destinationDir) {
        this.destinationDir = destinationDir;
    }

    @Override
    public boolean isCurrentBranch() {
        return currentBranch;
    }

    @DataBoundSetter
    public void setCurrentBranch(boolean currentBranch) {
        this.currentBranch = currentBranch;
    }

    @Override
    public boolean isResetFirst() {
        return resetFirst;
    }

    @DataBoundSetter
    public void setResetFirst(boolean resetFirst) {
        this.resetFirst = resetFirst;
    }

    @Override
    public boolean isQuiet() {
        return quiet;
    }

    @DataBoundSetter
    public void setQuiet(boolean quiet) {
        this.quiet = quiet;
    }

    @Override
    public boolean isForceSync() {
        return forceSync;
    }

    @DataBoundSetter
    public void setForceSync(boolean forceSync) {
        this.forceSync = forceSync;
    }

    @Override
    public boolean isTrace() {
        return trace;
    }

    @DataBoundSetter
    public void setTrace(boolean trace) {
        this.trace = trace;
    }

    @Override
    public boolean isShowAllChanges() {
        return showAllChanges;
    }

    @DataBoundSetter
    public void setShowAllChanges(boolean showAllChanges) {
        this.showAllChanges = showAllChanges;
    }

    @Override
    public boolean isNoTags() {
        return noTags;
    }

    @DataBoundSetter
    public void setNoTags(boolean noTags) {
        this.noTags = noTags;
    }

    @Override
    public Set<String> getIgnoreProjects() {
        return ignoreProjects;
    }

    @DataBoundSetter
    public void setIgnoreProjects(Set<String> ignoreProjects) {
        this.ignoreProjects = ignoreProjects;
    }
}
