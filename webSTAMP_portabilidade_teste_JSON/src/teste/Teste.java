/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import teste.Actuators;
import teste.Project;

/**
 *
 * @author Gustavo
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Lendo e gerando na memória o projeto Traind Door System
        String json =  new String(Files.readAllBytes(Paths.get("C:\\Users\\Gustavo\\Documents\\NetBeansProjects\\webSTAMP_portabilidade_teste_JSON\\src\\teste\\trainDoorSystemI.json")));
        Project projeto = new Gson().fromJson(json, Project.class);
        
        //Adicionando uma nova Loss
        Losses loss = new Losses(999, "teste", "teste", 1, "2021-09-21 17:27:12", "2021-09-21 17:27:12");
        projeto.losses.add(loss);
        
        for(int i = 0; i < projeto.getLosses().size(); i++){
            System.out.printf("Losses %d: \n", i);
            System.out.printf("\t id: %d\n", projeto.getLosses().get(i).getId());
            System.out.printf("\t name: %s\n", projeto.getLosses().get(i).getName());
            System.out.printf("\t description: %s\n", projeto.getLosses().get(i).getDescription());
            System.out.printf("\t project_id: %d\n", projeto.getLosses().get(i).getProject_id());
            System.out.printf("\t Created_At: %s \n", projeto.getLosses().get(i).getCreated_at());
            System.out.printf("\t Update_at: %s \n", projeto.getLosses().get(i).getUpdated_at());
        }
        
        String jsonII = new Gson().toJson(projeto);
        
        FileWriter fileWriter = new FileWriter("C:\\Users\\Gustavo\\Documents\\NetBeansProjects\\webSTAMP_portabilidade_teste_JSON\\src\\teste\\newTrainDoorSystem.json");
        fileWriter.write(jsonII);
        fileWriter.close();
        
        System.out.printf("id: %d\n", projeto.getId());
        System.out.printf("name: %s\n", projeto.getName());
        System.out.printf("Description: %s\n", projeto.getDescription());
        System.out.printf("Creaated_at: %s\n", projeto.getCreated_at());
        System.out.printf("update_at: %s\n", projeto.getUpdated_at());
        System.out.printf("URL: %s\n", projeto.getURL());
        System.out.printf("Type: %s\n", projeto.getType());
        
        for(int i = 0; i < projeto.getActuators().size(); i++){
            System.out.printf("Actuator %d: \n", i);
            System.out.printf("\t id: %d\n", projeto.getActuators().get(i).getId());
            System.out.printf("\t name: %s\n", projeto.getActuators().get(i).getName());
            System.out.printf("\t project_id: %d\n", projeto.getActuators().get(i).getProject_id());
            System.out.printf("\t Created_at: %s\n", projeto.getActuators().get(i).getCreated_at());
            System.out.printf("\t Update_at: %s\n", projeto.getActuators().get(i).getUpdated_at());
        }
        
        for(int i = 0; i < projeto.getAssumptions().size(); i++){
            System.out.printf("Assumption %d: \n", i);
            System.out.printf("\t id: %d\n", projeto.getAssumptions().get(i).getId());
            System.out.printf("\t name: %s\n", projeto.getAssumptions().get(i).getName());
            System.out.printf("\t description: %s\n", projeto.getAssumptions().get(i).getDescription());
            System.out.printf("\t Created_At: %s \n", projeto.getAssumptions().get(i).getCreated_at());
            System.out.printf("\t Update_at: %s \n", projeto.getAssumptions().get(i).getUpdated_at());
        }
        
        System.out.println("Controlled_process: ");
        System.out.printf("\t id: %s\n", projeto.getControlled_process().getId());
        System.out.printf("\t name: %s\n", projeto.getControlled_process().getName());
        System.out.printf("\t project_id: %d \n", projeto.getControlled_process().getProject_id());
        System.out.printf("\t Created_At: %s \n", projeto.getControlled_process().getCreated_at());
        System.out.printf("\t Update_at: %s \n", projeto.getControlled_process().getUpdated_at());
        
        
        for(int i = 0; i < projeto.getControllers().size(); i++){
            System.out.printf("Controller %d:\n", i);
            System.out.printf("\t id: %d\n", projeto.getControllers().get(i).getId());
            System.out.printf("\t name; %s\n", projeto.getControllers().get(i).getName());
            System.out.printf("\t type: %s\n", projeto.getControllers().get(i).getType());
            System.out.printf("\t project_id: %d\n", projeto.getControllers().get(i).getProject_id());
            System.out.printf("\t Created_At: %s \n", projeto.getControllers().get(i).getCreated_at());
            System.out.printf("\t Update_at: %s \n", projeto.getControllers().get(i).getUpdated_at());
            for(int j = 0; j < projeto.getControllers().get(i).getControlaction().size(); j++){
                System.out.printf("\t Controlaction %d\n", j);
                System.out.printf("\t\t id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getId());
                System.out.printf("\t\t name: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getName());
                System.out.printf("\t\t deacription: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getDescription());
                System.out.printf("\t\t Controller_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getController_id());
                System.out.printf("\t\t Created_At: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getCreated_at());
                System.out.printf("\t\t Update_at: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getUpdated_at());
                for(int k = 0; k < projeto.getControllers().get(i).getControlaction().get(j).getRules().size(); k++){
                    System.out.printf("\t\t Rule %d: \n", k);
                    System.out.printf("\t\t\t id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getRules().get(k).getId());
                    System.out.printf("\t\t\t conrolaciton_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getRules().get(k).getControlaction_id());
                    System.out.printf("\t\t\t column: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getRules().get(k).getColumn());
                    System.out.printf("\t\t\t Created_At: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getRules().get(k).getCreated_at());
                    System.out.printf("\t\t\t Update_at: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getRules().get(k).getUpdated_at());
                    System.out.printf("\t\t\t variable_state:\n");
                    System.out.printf("\t\t\t\t rule_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getRules().get(k).getVariableState().getRule_id());
                    System.out.printf("\t\t\t\t variable_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getRules().get(k).getVariableState().getVariable_id());
                    System.out.printf("\t\t\t\t staate_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getRules().get(k).getVariableState().getState_id());
                    System.out.printf("\t\t\t\t Created_At: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getRules().get(k).getVariableState().getCreated_at());
                    System.out.printf("\t\t\t\t Update_at: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getRules().get(k).getVariableState().getUpdated_at());
                }
                for(int k = 0; k < projeto.getControllers().get(i).getControlaction().get(j).getContext_table().size(); k++){
                    System.out.printf("\t Context_table %d: \n", k);
                    System.out.printf("\t\t id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getId());
                    System.out.printf("\t\t controlaction_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getControlaction_id());
                    System.out.printf("\t\t context: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getContext());
                    System.out.printf("\t\t ca_provided: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getCa_provided());
                    System.out.printf("\t\t ca_not_provided: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getCa_not_provided());
                    System.out.printf("\t\t wrong_time_order: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getWrong_time_order());
                    System.out.printf("\t\t ca_too_early: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getCa_too_early());
                    System.out.printf("\t\t ca_too_late: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getCa_too_late());
                    System.out.printf("\t\t ca_too_soon: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getCa_too_soon());
                    System.out.printf("\t\t ca_too_long: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getCa_too_long());
                    System.out.printf("\t\t Created_At: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getCreated_at());
                    System.out.printf("\t\t Update_at: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getContext_table().get(k).getUpdated_at());
                }
                for(int k = 0; k < projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().size(); k++){
                    System.out.printf("\t Safety_constraint %d: \n", k);
                    System.out.printf("\t\t id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getId());
                    System.out.printf("\t\t unsafe_contrl_action: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getUnsafe_control_action());
                    System.out.printf("\t\t safety_constraint: %s", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getSafety_constraint());
                    System.out.printf("\t\t type: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getType());
                    System.out.printf("\t\t context: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getContext());
                    System.out.printf("\t\t controlaction_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getControlaction_id());
                    System.out.printf("\t\t rule_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRule_id());
                    System.out.printf("\t\t flag: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getFlag());
                    System.out.printf("\t\t Created_At: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCreated_at());
                    System.out.printf("\t Update_at: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getUpdated_at());
                    for(int l = 0; l < projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().size(); l++){
                        System.out.printf("\t\t Causal_analysis %d: \n", l);
                        System.out.printf("\t\t\t id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getId());
                        System.out.printf("\t\t\t scenario: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getScenario());
                        System.out.printf("\t\t\t associated_causal_factor: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getAssociated_causal_factor());
                        System.out.printf("\t\t\t requirement: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getRequirement());
                        System.out.printf("\t\t\t role: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getRole());
                        System.out.printf("\t\t\t rationale: %s\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getRationale());
                        System.out.printf("\t\t\t guideWord_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getGuideword_id());
                        System.out.printf("\t\t\t SafetyConstraint_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getSafety_constraint_id());
                        System.out.printf("\t\t\t Created_At: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getCreated_at());
                        System.out.printf("\t\t\t Update_at: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getUpdated_at());
                    }
                    for(int l = 0; l < projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRules_safety_constraints_hazards().size(); l++){
                        System.out.printf("\t\t Rules_safetu_constraint_hazards %d: \n", l);
                        System.out.printf("\t\t\t rule_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRules_safety_constraints_hazards().get(l).getRule_id());
                        System.out.printf("\t\t\t sc_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRules_safety_constraints_hazards().get(l).getSc_id());
                        System.out.printf("\t\t\t hazard_id: %d\n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRules_safety_constraints_hazards().get(l).getHazard_id());
                        System.out.printf("\t\t\t Created_At: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRules_safety_constraints_hazards().get(l).getCreated_at());
                        System.out.printf("\t\t\t Update_at: %s \n", projeto.getControllers().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRules_safety_constraints_hazards().get(l).getUpdated_at());
                    }
                }
            }
            for(int j = 0; j < projeto.getControllers().get(i).getVariables().size(); j++){
                System.out.printf("\t Variable %d: \n", j);
                System.out.printf("\t\t id: %d\n", projeto.getControllers().get(i).getVariables().get(j).getId());
                System.out.printf("\t\t name: %s\n", projeto.getControllers().get(i).getVariables().get(j).getName());
                System.out.printf("\t\t project_id: %d\n", projeto.getControllers().get(i).getVariables().get(j).getProject_id());
                System.out.printf("\t\t controller_id: %d\n", projeto.getControllers().get(i).getVariables().get(j).getController_id());
                System.out.printf("\t\t Created_At: %s \n", projeto.getControllers().get(i).getVariables().get(j).getCreated_at());
                System.out.printf("\t\t Update_at: %s \n", projeto.getControllers().get(i).getVariables().get(j).getUpdated_at());
                for(int k = 0; k < projeto.getControllers().get(i).getVariables().get(j).getState().size(); k++){
                    System.out.printf("\t\t Satate %d: \n", k);
                    System.out.printf("\t\t\t id: %d\n", projeto.getControllers().get(i).getVariables().get(j).getState().get(k).getId());
                    System.out.printf("\t\t\t Name: %s\n", projeto.getControllers().get(i).getVariables().get(j).getState().get(k).getName());
                    System.out.printf("\t\t\t variable_id: %d\n", projeto.getControllers().get(i).getVariables().get(j).getState().get(k).getVariable_id());
                    System.out.printf("\t\t\t Created_At: %s \n", projeto.getControllers().get(i).getVariables().get(j).getState().get(k).getCreated_at());
                    System.out.printf("\t\t\t Update_at: %s \n", projeto.getControllers().get(i).getVariables().get(j).getState().get(k).getUpdated_at());
                }
            }
        }
        
        for(int i = 0; i < projeto.getHazards().size(); i++){
            System.out.printf("Hazards %d: \n", i);
            System.out.printf("\t id: %d\n", projeto.getHazards().get(i).getId());
            System.out.printf("\t Name: %s\n", projeto.getHazards().get(i).getName());
            System.out.printf("\t Description: %s\n", projeto.getHazards().get(i).getDescription());
            System.out.printf("\t project_id: %d\n", projeto.getHazards().get(i).getProject_id());
            System.out.printf("\t Created_At: %s \n", projeto.getHazards().get(i).getCreated_at());
            System.out.printf("\t Update_at: %s \n", projeto.getHazards().get(i).getUpdated_at());
            for(int j = 0; j < projeto.getHazards().get(i).getLosseshazards().size(); j++){
                System.out.printf("\t Losses_hazards %d: \n", j);
                System.out.printf("\t\t id: %d\n", projeto.getHazards().get(i).getLosseshazards().get(j).getId());
                System.out.printf("\t\t loss_id: %d\n", projeto.getHazards().get(i).getLosseshazards().get(j).getLoss_id());
                System.out.printf("\t\t hazard_id: %d\n", projeto.getHazards().get(i).getLosseshazards().get(j).getHazard_id());
                System.out.printf("\t\t Created_At: %s \n", projeto.getHazards().get(i).getLosseshazards().get(j).getCreated_at());
                System.out.printf("\t\t Update_at: %s \n", projeto.getHazards().get(i).getLosseshazards().get(j).getUpdated_at());
            }
        }
        
        for(int i = 0; i < projeto.getLosses().size(); i++){
            System.out.printf("Losses %d: \n", i);
            System.out.printf("\t id: %d\n", projeto.getLosses().get(i).getId());
            System.out.printf("\t name: %s\n", projeto.getLosses().get(i).getName());
            System.out.printf("\t description: %s\n", projeto.getLosses().get(i).getDescription());
            System.out.printf("\t project_id: %d\n", projeto.getLosses().get(i).getProject_id());
            System.out.printf("\t Created_At: %s \n", projeto.getLosses().get(i).getCreated_at());
            System.out.printf("\t Update_at: %s \n", projeto.getLosses().get(i).getUpdated_at());
        }
        
        for(int i = 0; i < projeto.getMissions().size(); i++){
            System.out.printf("Missions %d: \n", i);
            System.out.printf("\t id: %d\n", projeto.getMissions().get(i).getId());
            System.out.printf("\t Purpose: %s\n", projeto.getMissions().get(i).getPurpose());
            System.out.printf("\t Method: %s\n", projeto.getMissions().get(i).getMethod());
            System.out.printf("\t Goals: %s\n", projeto.getMissions().get(i).getGoals());
            System.out.printf("\t Project_id: %d\n", projeto.getMissions().get(i).getProject_id());
            System.out.printf("\t Created_At: %s \n", projeto.getMissions().get(i).getCreated_at());
            System.out.printf("\t Update_at: %s \n", projeto.getMissions().get(i).getUpdate_at());
        }
        
        for(int i = 0; i < projeto.getSensor().size(); i++){
            System.out.printf("Sensor %d: \n", i);
            System.out.printf("\t id: %d\n", projeto.getSensor().get(i).getId());
            System.out.printf("\t Name: %s\n", projeto.getSensor().get(i).getName());
            System.out.printf("\t project_id: %d\n", projeto.getSensor().get(i).getProject_id());
            System.out.printf("\t Created_At: %s \n", projeto.getSensor().get(i).getCreated_at());
            System.out.printf("\t Update_at: %s \n", projeto.getSensor().get(i).getUpdated_at());
        }
        
        for(int i = 0; i < projeto.getSystem_goals().size(); i++){
            System.out.printf("System_goals %d: \n", i);
            System.out.printf("\t id: $d\n", projeto.getSystem_goals().get(i).getId());
            System.out.printf("\t name: %s\n", projeto.getSystem_goals().get(i).getName());
            System.out.printf("\t description: %s\n", projeto.getSystem_goals().get(i).getDescription());
            System.out.printf("\t project_id: %d\n", projeto.getSystem_goals().get(i).getProject_id());
            System.out.printf("\t Created_At: %s \n", projeto.getSystem_goals().get(i).getCreated_at());
            System.out.printf("\t Update_at: %s \n", projeto.getSystem_goals().get(i).getUpdated_at());
        }
        
        for(int i = 0; i < projeto.getSsc().size(); i++){
            System.out.printf("System_safety_cnsraint %d: \n", i);
            System.out.printf("\t id: %d\n", projeto.getSsc().get(i).getId());
            System.out.printf("\t name: %s\n", projeto.getSsc().get(i).getName());
            System.out.printf("\t description: %s\n", projeto.getSsc().get(i).getDescription());
            System.out.printf("\t project_id: %d\n", projeto.getSsc().get(i).getProject_id());
            System.out.printf("\t Created_At: %s \n", projeto.getSsc().get(i).getCreated_at());
            System.out.printf("\t Update_at: %s \n", projeto.getSsc().get(i).getUpdated_at());
            for(int j = 0; j < projeto.getSsc().get(i).getSystem_safety_constraint_hazards().size(); j++){
                System.out.printf("\t System_safety_constriant_hazards %d: \n", j);
                System.out.printf("\t\t ssc_id: %d\n", projeto.getSsc().get(i).getSystem_safety_constraint_hazards().get(j).getSsc_id());
                System.out.printf("\t\t hazaards_id: %d\n", projeto.getSsc().get(i).getSystem_safety_constraint_hazards().get(j).getHazard_id());
                System.out.printf("\t\t Created_At: %s \n", projeto.getSsc().get(i).getSystem_safety_constraint_hazards().get(j).getCreated_at());
                System.out.printf("\t\t Update_at: %s \n", projeto.getSsc().get(i).getSystem_safety_constraint_hazards().get(j).getUpdated_at());
            }
        }
        //System.out.printf("\t Created_At: %s \n",);
        //System.out.printf("\t Update_at: %s \n",);
        /*Actuator atuador = new Actuator();
        atuador.setId(1);
        atuador.setName("Train door");
        
        Project projeto = new Project(1, "trains door system", "sdasd", "12", "13", "www", "safety", atuador);
        
        System.out.printf("O nome do projeto é %s, e o nome do atuador que esse projeto tem é %s", projeto.getName(), projeto.getActuator().getName());
        */
    }
    
}
