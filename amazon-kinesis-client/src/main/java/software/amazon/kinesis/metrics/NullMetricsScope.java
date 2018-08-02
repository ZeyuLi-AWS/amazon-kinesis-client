/*
 *  Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the License.
 *  A copy of the License is located at
 *
 *  http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package software.amazon.kinesis.metrics;

import software.amazon.awssdk.services.cloudwatch.model.StandardUnit;

public class NullMetricsScope implements MetricsScope {

    @Override
    public void addData(String name, double value, StandardUnit unit) {

    }

    @Override
    public void addData(String name, double value, StandardUnit unit, MetricsLevel level) {

    }

    @Override
    public void addDimension(String name, String value) {

    }

    @Override
    public void end() {

    }
}
