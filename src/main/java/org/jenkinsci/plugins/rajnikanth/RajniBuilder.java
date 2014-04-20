package org.jenkinsci.plugins.rajnikanth;
import hudson.Extension;
import hudson.model.AbstractProject;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Publisher;

@Extension
public class RajniBuilder extends BuildStepDescriptor<Publisher> {

    public RajniBuilder() {
        super(CordellWalkerRecorder.class);
    }

    @Override
    public boolean isApplicable(Class<? extends AbstractProject> aClass) {
        return true;
    }

    @Override
    public String getDisplayName() {
        return "Activate Rajnikanth";
    }
}