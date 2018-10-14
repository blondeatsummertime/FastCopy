package org.mhisoft.fc;

/**
 * Run time properties
 */
public class RunTimeProperties {

	public static RunTimeProperties instance = new RunTimeProperties();

	private RunTimeProperties() {
		//
	}

	String sourceDir = null;
	String destDir = null;
	boolean success;
	boolean verbose;
	int numOfThreads=1;
	boolean overwrite;
	boolean overwriteIfNewerOrDifferent;
	boolean flatCopy;
	boolean debug;
	boolean createTheSameSourceFolderUnderTarget;
	String[] inludeFilePatterns;
	String[] exludeFilePatterns;


	public String getSourceDir() {
		return sourceDir;
	}

	public void setSourceDir(String sourceDir) {
		this.sourceDir = sourceDir;
	}

	public String getDestDir() {
		return destDir;
	}

	public void setDestDir(String destDir) {
		this.destDir = destDir;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean isVerbose() {
		return verbose;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public int getNumOfThreads() {
		return numOfThreads;
	}

	public void setNumOfThreads(int numOfThreads) {
		this.numOfThreads = numOfThreads;
	}

	public boolean isOverwrite() {
		return overwrite;
	}

	public void setOverwrite(boolean overwrite) {
		this.overwrite = overwrite;
	}

	public boolean isFlatCopy() {
		return flatCopy;
	}

	public void setFlatCopy(boolean flatCopy) {
		this.flatCopy = flatCopy;
	}

	public boolean isOverwriteIfNewerOrDifferent() {
		return overwriteIfNewerOrDifferent;
	}

	public void setOverwriteIfNewerOrDifferent(boolean overwriteIfNewerOrDifferent) {
		this.overwriteIfNewerOrDifferent = overwriteIfNewerOrDifferent;
	}

	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public boolean isCreateTheSameSourceFolderUnderTarget() {
		return createTheSameSourceFolderUnderTarget;
	}

	public void setCreateTheSameSourceFolderUnderTarget(boolean createTheSameSourceFolderUnderTarget) {
		this.createTheSameSourceFolderUnderTarget = createTheSameSourceFolderUnderTarget;
	}

	public String[] getInludeFilePatterns() {
		return inludeFilePatterns;
	}


	public void setIncludeFilePatterns(String pattern) {
		if (pattern!=null && pattern.trim().length()>0) {
			this.inludeFilePatterns = pattern.trim().split("[,;]+");
			for (int i = 0; i < inludeFilePatterns.length; i++) {
				this.inludeFilePatterns[i] = this.inludeFilePatterns[i].trim();
			}
		}
		else
			this.inludeFilePatterns=null;
	}

	public String[] getExludeFilePatterns() {
		return exludeFilePatterns;
	}

	public void setExludeFilePatterns(String pattern) {
		if (pattern!=null && pattern.trim().length()>0) {
			this.exludeFilePatterns = pattern.trim().split("[,;]+");
			for (int i = 0; i < exludeFilePatterns.length; i++) {
				this.exludeFilePatterns[i] = this.exludeFilePatterns[i].trim();
			}
		}
		else
			this.exludeFilePatterns=null;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("RunTimeProperties{");
		sb.append("sourceDir='").append(sourceDir).append('\'');
		sb.append(", destDir='").append(destDir).append('\'');
		sb.append(", success=").append(success);
		sb.append(", verbose=").append(verbose);
		sb.append(", numOfThreads=").append(numOfThreads);
		sb.append(", overwrite=").append(overwrite);
		sb.append(", overwriteIfNewerOrDifferent=").append(overwriteIfNewerOrDifferent);
		sb.append(", createTheSameSourceFolderUnderTarget=").append(createTheSameSourceFolderUnderTarget);
		sb.append(", flatCopy=").append(flatCopy);
		sb.append(", debug=").append(debug);
		sb.append('}');
		return sb.toString();
	}
}
