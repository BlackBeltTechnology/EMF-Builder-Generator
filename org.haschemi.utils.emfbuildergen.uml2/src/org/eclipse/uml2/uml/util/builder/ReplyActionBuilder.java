package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ReplyAction</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ReplyActionBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.ReplyAction> {
  // features and builders
  private org.eclipse.uml2.uml.Activity m_activity;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> m_featureActivityBuilder;
  private org.eclipse.uml2.uml.StructuredActivityNode m_inStructuredNode;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StructuredActivityNode> m_featureInStructuredNodeBuilder;
  private Boolean m_isLeaf;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.Trigger m_replyToCall;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger> m_featureReplyToCallBuilder;
  private org.eclipse.uml2.uml.InputPin m_returnInformation;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InputPin> m_featureReturnInformationBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.ExceptionHandler> m_handler = new java.util.LinkedList<org.eclipse.uml2.uml.ExceptionHandler>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExceptionHandler>> m_featureHandlerBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExceptionHandler>>();
  private java.util.Collection<org.eclipse.uml2.uml.InterruptibleActivityRegion> m_inInterruptibleRegion = new java.util.LinkedList<org.eclipse.uml2.uml.InterruptibleActivityRegion>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion>> m_featureInInterruptibleRegionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityPartition> m_inPartition = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityPartition>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition>> m_featureInPartitionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_incoming = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>> m_featureIncomingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_localPostcondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featureLocalPostconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_localPrecondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featureLocalPreconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_outgoing = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>> m_featureOutgoingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityNode> m_redefinedNode = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityNode>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode>> m_featureRedefinedNodeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode>>();
  private java.util.Collection<org.eclipse.uml2.uml.InputPin> m_replyValue = new java.util.LinkedList<org.eclipse.uml2.uml.InputPin>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InputPin>> m_featureReplyValueBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InputPin>>();
  // helper attributes
  private boolean m_featureActivitySet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureHandlerSet = false;
  private boolean m_featureInInterruptibleRegionSet = false;
  private boolean m_featureInPartitionSet = false;
  private boolean m_featureInStructuredNodeSet = false;
  private boolean m_featureIncomingSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureLocalPostconditionSet = false;
  private boolean m_featureLocalPreconditionSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOutgoingSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureRedefinedNodeSet = false;
  private boolean m_featureReplyToCallSet = false;
  private boolean m_featureReplyValueSet = false;
  private boolean m_featureReturnInformationSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newReplyActionBuilder()
   */
  private ReplyActionBuilder() {
  }

  /**
   * This method creates a new instance of the ReplyActionBuilder.
   * @return new instance of the ReplyActionBuilder
   */
  public static ReplyActionBuilder newReplyActionBuilder() {
    return new ReplyActionBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ReplyActionBuilder but() {
    ReplyActionBuilder _builder = newReplyActionBuilder();
    _builder.m_featureActivitySet = m_featureActivitySet;
    _builder.m_activity = m_activity;
    _builder.m_featureActivityBuilder = m_featureActivityBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureHandlerSet = m_featureHandlerSet;
    _builder.m_handler = m_handler;
    _builder.m_featureHandlerBuilder = m_featureHandlerBuilder;
    _builder.m_featureInInterruptibleRegionSet = m_featureInInterruptibleRegionSet;
    _builder.m_inInterruptibleRegion = m_inInterruptibleRegion;
    _builder.m_featureInInterruptibleRegionBuilder = m_featureInInterruptibleRegionBuilder;
    _builder.m_featureInPartitionSet = m_featureInPartitionSet;
    _builder.m_inPartition = m_inPartition;
    _builder.m_featureInPartitionBuilder = m_featureInPartitionBuilder;
    _builder.m_featureInStructuredNodeSet = m_featureInStructuredNodeSet;
    _builder.m_inStructuredNode = m_inStructuredNode;
    _builder.m_featureInStructuredNodeBuilder = m_featureInStructuredNodeBuilder;
    _builder.m_featureIncomingSet = m_featureIncomingSet;
    _builder.m_incoming = m_incoming;
    _builder.m_featureIncomingBuilder = m_featureIncomingBuilder;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureLocalPostconditionSet = m_featureLocalPostconditionSet;
    _builder.m_localPostcondition = m_localPostcondition;
    _builder.m_featureLocalPostconditionBuilder = m_featureLocalPostconditionBuilder;
    _builder.m_featureLocalPreconditionSet = m_featureLocalPreconditionSet;
    _builder.m_localPrecondition = m_localPrecondition;
    _builder.m_featureLocalPreconditionBuilder = m_featureLocalPreconditionBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOutgoingSet = m_featureOutgoingSet;
    _builder.m_outgoing = m_outgoing;
    _builder.m_featureOutgoingBuilder = m_featureOutgoingBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureRedefinedNodeSet = m_featureRedefinedNodeSet;
    _builder.m_redefinedNode = m_redefinedNode;
    _builder.m_featureRedefinedNodeBuilder = m_featureRedefinedNodeBuilder;
    _builder.m_featureReplyToCallSet = m_featureReplyToCallSet;
    _builder.m_replyToCall = m_replyToCall;
    _builder.m_featureReplyToCallBuilder = m_featureReplyToCallBuilder;
    _builder.m_featureReplyValueSet = m_featureReplyValueSet;
    _builder.m_replyValue = m_replyValue;
    _builder.m_featureReplyValueBuilder = m_featureReplyValueBuilder;
    _builder.m_featureReturnInformationSet = m_featureReturnInformationSet;
    _builder.m_returnInformation = m_returnInformation;
    _builder.m_featureReturnInformationBuilder = m_featureReturnInformationBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ReplyAction type.
   * @return new instance of the org.eclipse.uml2.uml.ReplyAction type
   */
  public org.eclipse.uml2.uml.ReplyAction build() {
    final org.eclipse.uml2.uml.ReplyAction _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createReplyAction();
    if (m_featureActivitySet) {
      _newInstance.setActivity(m_activity);
    } else {
      if (m_featureActivityBuilder != null) {
        _newInstance.setActivity(m_featureActivityBuilder.build());
      }
    }
    if (m_featureInStructuredNodeSet) {
      _newInstance.setInStructuredNode(m_inStructuredNode);
    } else {
      if (m_featureInStructuredNodeBuilder != null) {
        _newInstance.setInStructuredNode(m_featureInStructuredNodeBuilder.build());
      }
    }
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureNameExpressionSet) {
      _newInstance.setNameExpression(m_nameExpression);
    } else {
      if (m_featureNameExpressionBuilder != null) {
        _newInstance.setNameExpression(m_featureNameExpressionBuilder.build());
      }
    }
    if (m_featureReplyToCallSet) {
      _newInstance.setReplyToCall(m_replyToCall);
    } else {
      if (m_featureReplyToCallBuilder != null) {
        _newInstance.setReplyToCall(m_featureReplyToCallBuilder.build());
      }
    }
    if (m_featureReturnInformationSet) {
      _newInstance.setReturnInformation(m_returnInformation);
    } else {
      if (m_featureReturnInformationBuilder != null) {
        _newInstance.setReturnInformation(m_featureReturnInformationBuilder.build());
      }
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
    }
    if (m_featureClientDependencySet) {
      _newInstance.getClientDependencies().addAll(m_clientDependency);
    } else {
      if (!m_featureClientDependencyBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> builder : m_featureClientDependencyBuilder) {
          _newInstance.getClientDependencies().add(builder.build());
        }
      }
    }
    if (m_featureEAnnotationsSet) {
      _newInstance.getEAnnotations().addAll(m_eAnnotations);
    } else {
      if (!m_featureEAnnotationsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> builder : m_featureEAnnotationsBuilder) {
          _newInstance.getEAnnotations().add(builder.build());
        }
      }
    }
    if (m_featureHandlerSet) {
      _newInstance.getHandlers().addAll(m_handler);
    } else {
      if (!m_featureHandlerBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExceptionHandler> builder : m_featureHandlerBuilder) {
          _newInstance.getHandlers().add(builder.build());
        }
      }
    }
    if (m_featureInInterruptibleRegionSet) {
      _newInstance.getInInterruptibleRegions().addAll(m_inInterruptibleRegion);
    } else {
      if (!m_featureInInterruptibleRegionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion> builder : m_featureInInterruptibleRegionBuilder) {
          _newInstance.getInInterruptibleRegions().add(builder.build());
        }
      }
    }
    if (m_featureInPartitionSet) {
      _newInstance.getInPartitions().addAll(m_inPartition);
    } else {
      if (!m_featureInPartitionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition> builder : m_featureInPartitionBuilder) {
          _newInstance.getInPartitions().add(builder.build());
        }
      }
    }
    if (m_featureIncomingSet) {
      _newInstance.getIncomings().addAll(m_incoming);
    } else {
      if (!m_featureIncomingBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> builder : m_featureIncomingBuilder) {
          _newInstance.getIncomings().add(builder.build());
        }
      }
    }
    if (m_featureLocalPostconditionSet) {
      _newInstance.getLocalPostconditions().addAll(m_localPostcondition);
    } else {
      if (!m_featureLocalPostconditionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> builder : m_featureLocalPostconditionBuilder) {
          _newInstance.getLocalPostconditions().add(builder.build());
        }
      }
    }
    if (m_featureLocalPreconditionSet) {
      _newInstance.getLocalPreconditions().addAll(m_localPrecondition);
    } else {
      if (!m_featureLocalPreconditionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> builder : m_featureLocalPreconditionBuilder) {
          _newInstance.getLocalPreconditions().add(builder.build());
        }
      }
    }
    if (m_featureOutgoingSet) {
      _newInstance.getOutgoings().addAll(m_outgoing);
    } else {
      if (!m_featureOutgoingBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> builder : m_featureOutgoingBuilder) {
          _newInstance.getOutgoings().add(builder.build());
        }
      }
    }
    if (m_featureOwnedCommentSet) {
      _newInstance.getOwnedComments().addAll(m_ownedComment);
    } else {
      if (!m_featureOwnedCommentBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> builder : m_featureOwnedCommentBuilder) {
          _newInstance.getOwnedComments().add(builder.build());
        }
      }
    }
    if (m_featureRedefinedNodeSet) {
      _newInstance.getRedefinedNodes().addAll(m_redefinedNode);
    } else {
      if (!m_featureRedefinedNodeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> builder : m_featureRedefinedNodeBuilder) {
          _newInstance.getRedefinedNodes().add(builder.build());
        }
      }
    }
    if (m_featureReplyValueSet) {
      _newInstance.getReplyValues().addAll(m_replyValue);
    } else {
      if (!m_featureReplyValueBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InputPin> builder : m_featureReplyValueBuilder) {
          _newInstance.getReplyValues().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ReplyActionBuilder withActivity(org.eclipse.uml2.uml.Activity p_activity) {
    m_activity = p_activity;
    m_featureActivitySet = true;
    return this;
  }

  public ReplyActionBuilder withActivity(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> p_activityBuilder) {
    m_featureActivityBuilder = p_activityBuilder;
    return this;
  }

  public ReplyActionBuilder withInStructuredNode(org.eclipse.uml2.uml.StructuredActivityNode p_inStructuredNode) {
    m_inStructuredNode = p_inStructuredNode;
    m_featureInStructuredNodeSet = true;
    return this;
  }

  public ReplyActionBuilder withInStructuredNode(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StructuredActivityNode> p_structuredActivityNodeBuilder) {
    m_featureInStructuredNodeBuilder = p_structuredActivityNodeBuilder;
    return this;
  }

  public ReplyActionBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public ReplyActionBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ReplyActionBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ReplyActionBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ReplyActionBuilder withReplyToCall(org.eclipse.uml2.uml.Trigger p_replyToCall) {
    m_replyToCall = p_replyToCall;
    m_featureReplyToCallSet = true;
    return this;
  }

  public ReplyActionBuilder withReplyToCall(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger> p_triggerBuilder) {
    m_featureReplyToCallBuilder = p_triggerBuilder;
    return this;
  }

  public ReplyActionBuilder withReturnInformation(org.eclipse.uml2.uml.InputPin p_returnInformation) {
    m_returnInformation = p_returnInformation;
    m_featureReturnInformationSet = true;
    return this;
  }

  public ReplyActionBuilder withReturnInformation(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InputPin> p_inputPinBuilder) {
    m_featureReturnInformationBuilder = p_inputPinBuilder;
    return this;
  }

  public ReplyActionBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ReplyActionBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ReplyActionBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ReplyActionBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ReplyActionBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ReplyActionBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ReplyActionBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public ReplyActionBuilder withHandler(org.eclipse.uml2.uml.ExceptionHandler p_handler) {
    m_handler.add(p_handler);
    m_featureHandlerSet = true;
    return this;
  }

  public ReplyActionBuilder withHandler(java.util.Collection<? extends org.eclipse.uml2.uml.ExceptionHandler> p_handler) {
    m_handler.addAll(p_handler);
    m_featureHandlerSet = true;
    return this;
  }

  public ReplyActionBuilder withHandler(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExceptionHandler> p_exceptionHandlerBuilder) {
    m_featureHandlerBuilder.add(p_exceptionHandlerBuilder);
    return this;
  }

  public ReplyActionBuilder withInInterruptibleRegion(org.eclipse.uml2.uml.InterruptibleActivityRegion p_inInterruptibleRegion) {
    m_inInterruptibleRegion.add(p_inInterruptibleRegion);
    m_featureInInterruptibleRegionSet = true;
    return this;
  }

  public ReplyActionBuilder withInInterruptibleRegion(java.util.Collection<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion> p_inInterruptibleRegion) {
    m_inInterruptibleRegion.addAll(p_inInterruptibleRegion);
    m_featureInInterruptibleRegionSet = true;
    return this;
  }

  public ReplyActionBuilder withInInterruptibleRegion(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion> p_interruptibleActivityRegionBuilder) {
    m_featureInInterruptibleRegionBuilder.add(p_interruptibleActivityRegionBuilder);
    return this;
  }

  public ReplyActionBuilder withInPartition(org.eclipse.uml2.uml.ActivityPartition p_inPartition) {
    m_inPartition.add(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ReplyActionBuilder withInPartition(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityPartition> p_inPartition) {
    m_inPartition.addAll(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ReplyActionBuilder withInPartition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition> p_activityPartitionBuilder) {
    m_featureInPartitionBuilder.add(p_activityPartitionBuilder);
    return this;
  }

  public ReplyActionBuilder withIncoming(org.eclipse.uml2.uml.ActivityEdge p_incoming) {
    m_incoming.add(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public ReplyActionBuilder withIncoming(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_incoming) {
    m_incoming.addAll(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public ReplyActionBuilder withIncoming(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> p_activityEdgeBuilder) {
    m_featureIncomingBuilder.add(p_activityEdgeBuilder);
    return this;
  }

  public ReplyActionBuilder withLocalPostcondition(org.eclipse.uml2.uml.Constraint p_localPostcondition) {
    m_localPostcondition.add(p_localPostcondition);
    m_featureLocalPostconditionSet = true;
    return this;
  }

  public ReplyActionBuilder withLocalPostcondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_localPostcondition) {
    m_localPostcondition.addAll(p_localPostcondition);
    m_featureLocalPostconditionSet = true;
    return this;
  }

  public ReplyActionBuilder withLocalPostcondition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureLocalPostconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public ReplyActionBuilder withLocalPrecondition(org.eclipse.uml2.uml.Constraint p_localPrecondition) {
    m_localPrecondition.add(p_localPrecondition);
    m_featureLocalPreconditionSet = true;
    return this;
  }

  public ReplyActionBuilder withLocalPrecondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_localPrecondition) {
    m_localPrecondition.addAll(p_localPrecondition);
    m_featureLocalPreconditionSet = true;
    return this;
  }

  public ReplyActionBuilder withLocalPrecondition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureLocalPreconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public ReplyActionBuilder withOutgoing(org.eclipse.uml2.uml.ActivityEdge p_outgoing) {
    m_outgoing.add(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public ReplyActionBuilder withOutgoing(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_outgoing) {
    m_outgoing.addAll(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public ReplyActionBuilder withOutgoing(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> p_activityEdgeBuilder) {
    m_featureOutgoingBuilder.add(p_activityEdgeBuilder);
    return this;
  }

  public ReplyActionBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ReplyActionBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ReplyActionBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ReplyActionBuilder withRedefinedNode(org.eclipse.uml2.uml.ActivityNode p_redefinedNode) {
    m_redefinedNode.add(p_redefinedNode);
    m_featureRedefinedNodeSet = true;
    return this;
  }

  public ReplyActionBuilder withRedefinedNode(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityNode> p_redefinedNode) {
    m_redefinedNode.addAll(p_redefinedNode);
    m_featureRedefinedNodeSet = true;
    return this;
  }

  public ReplyActionBuilder withRedefinedNode(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> p_activityNodeBuilder) {
    m_featureRedefinedNodeBuilder.add(p_activityNodeBuilder);
    return this;
  }

  public ReplyActionBuilder withReplyValue(org.eclipse.uml2.uml.InputPin p_replyValue) {
    m_replyValue.add(p_replyValue);
    m_featureReplyValueSet = true;
    return this;
  }

  public ReplyActionBuilder withReplyValue(java.util.Collection<? extends org.eclipse.uml2.uml.InputPin> p_replyValue) {
    m_replyValue.addAll(p_replyValue);
    m_featureReplyValueSet = true;
    return this;
  }

  public ReplyActionBuilder withReplyValue(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InputPin> p_inputPinBuilder) {
    m_featureReplyValueBuilder.add(p_inputPinBuilder);
    return this;
  }
}
