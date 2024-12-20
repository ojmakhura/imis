// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by SpringWSImpl.java.vsl in andromda-webservices.
//
package bw.co.roguesystems.imis.policy;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy")
@CrossOrigin()
public class PolicyApiImpl extends PolicyApiBase {
    
    public PolicyApiImpl(
        PolicyService policyService    ) {
        
        super(
            policyService        );
    }


    @Override
    public ResponseEntity<?> handleFindById(Long id) {
        try {
            Optional<?> data = Optional.of(policyService.findById(id)); // TODO: Add custom code here;
            ResponseEntity<?> response;

            if(data.isPresent()) {
                response = ResponseEntity.status(HttpStatus.OK).body(data.get());
            } else {
                response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }

            return response;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<?> handleGetAll() {
        try {
            Optional<?> data = Optional.of(policyService.getAll()); // TODO: Add custom code here;
            ResponseEntity<?> response;

            if(data.isPresent()) {
                response = ResponseEntity.status(HttpStatus.OK).body(data.get());
            } else {
                response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }

            return response;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<?> handleRemove(Long id) {
        try {
            Optional<?> data = Optional.of(policyService.remove(id)); // TODO: Add custom code here;
            ResponseEntity<?> response;

            if(data.isPresent()) {
                response = ResponseEntity.status(HttpStatus.OK).body(data.get());
            } else {
                response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }

            return response;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<?> handleSave(PolicyVO policy) {
        try {

            if(policy.getCreatedAt() == null) {
                policy.setCreatedAt(java.time.LocalDateTime.now());
            }
            
            if(StringUtils.isBlank(policy.getCreatedBy())) {
                policy.setCreatedBy("SYSTEM");
            }

            if(policy.getCustomer().getId() == null) {

                if(policy.getCustomer().getCreatedAt() == null) {
                    policy.getCustomer().setCreatedAt(java.time.LocalDateTime.now());
                }
                
                if(StringUtils.isBlank(policy.getCustomer().getCreatedBy())) {
                    policy.getCustomer().setCreatedBy("SYSTEM");
                }

            }

            System.out.println(policy);

            Optional<?> data = Optional.of(policyService.save(policy)); // TODO: Add custom code here;
            ResponseEntity<?> response;

            if(data.isPresent()) {
                response = ResponseEntity.status(HttpStatus.OK).body(data.get());
            } else {
                response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }

            return response;
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<?> handleSearch(String criteria) {
        try {
            Optional<?> data = Optional.of(policyService.search(criteria, null)); // TODO: Add custom code here;
            ResponseEntity<?> response;

            if(data.isPresent()) {
                response = ResponseEntity.status(HttpStatus.OK).body(data.get());
            } else {
                response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }

            return response;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}