package jenkins.plugins.repo;

import hudson.model.TaskListener;
import hudson.scm.SCM;

import jenkins.scm.api.SCMHeadEvent;
import jenkins.scm.api.SCMHeadObserver;
import jenkins.scm.api.SCMSource;
import jenkins.scm.api.SCMSourceCriteria;
import jenkins.scm.api.SCMHead;
import jenkins.scm.api.SCMRevision;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

import java.io.IOException;
import java.util.Set;

public abstract class AbstractRepoSCMSource extends SCMSource {

    public AbstractRepoSCMSource(String id) {
        super(id);
    }

    public abstract String getManifestRepositoryUrl();

    public abstract String getIncludes();

    public abstract String getExcludes();

    @CheckForNull
    public String getManifestFile() {
        return null;
    }

    @CheckForNull
    public String getManifestGroup() {
        return null;
    }

    @CheckForNull
    public String getRepoUrl() {
        return null;
    }

    @CheckForNull
    public String getMirrorDir() {
        return null;
    }

    @CheckForNull
    public String getManifestBranch() {
        return null;
    }

    @CheckForNull
    public int getJobs() {
        return 0;
    }

    @CheckForNull
    public int getDepth() {
        return 0;
    }

    @CheckForNull
    public String getLocalManifest() {
        return null;
    }

    @CheckForNull
    public String getDestinationDir() {
        return null;
    }

    @CheckForNull
    public boolean isCurrentBranch() {
        return true;
    }

    @CheckForNull
    public boolean isResetFirst() {
        return false;
    }

    @CheckForNull
    public boolean isQuiet() {
        return true;
    }

    @CheckForNull
    public boolean isForceSync() {
        return false;
    }

    @CheckForNull
    public boolean isTrace() {
        return false;
    }

    @CheckForNull
    public boolean isShowAllChanges() {
        return false;
    }

    @CheckForNull
    public boolean isNoTags() {
        return false;
    }

    @CheckForNull
    public Set<String> getIgnoreProjects() {
        return null;
    }

    @Override
    protected void retrieve(@CheckForNull final SCMSourceCriteria criteria,
                            @Nonnull final SCMHeadObserver observer,
                            @CheckForNull final SCMHeadEvent<?> event,
                            @Nonnull final TaskListener listener)
            throws IOException, InterruptedException {

    }

    @Nonnull
    @Override
    public SCM build(@Nonnull SCMHead head, SCMRevision revision) {
        return null;
    }
}
