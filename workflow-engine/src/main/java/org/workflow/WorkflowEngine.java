package org.workflow;

import org.workflow.domain.Workflow;

public class WorkflowEngine {

	public void doWork(Workflow workflow){
		if(!workflow.isComplete()){
			// do work
		}else{
			// we're done
		}
	}
	
}
