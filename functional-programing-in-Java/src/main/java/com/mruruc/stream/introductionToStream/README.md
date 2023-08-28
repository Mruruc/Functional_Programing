# Java Streams: An Introduction

Java's Stream API provides a high-level abstraction for manipulating
sequences of elements using a functional approach. This document introduces the core concepts of the Stream API.

## Table of Contents
- [Definition and Overview](#definition-and-overview)
- [Difference between Collections and Streams](#difference-between-collections-and-streams)
- [How and Why to Use Streams?](#how-and-why-to-use-streams)

## Definition and Overview

A Stream in Java represents a sequence of elements that can be processed either in parallel or sequentially. Key characteristics of streams include:
- **Immutable**: Once created, streams cannot be modified.
- **Lazy**: Computations are only performed when necessary.
- **Auto-iterable**: Removes the need for explicit iteration.

## Difference between Collections and Streams

While both Collections and Streams deal with a group of objects, they have some key differences:

- **Purpose**
    - **Collections**: Primarily concerned with the efficient management and storage of data.
    - **Streams**: Focused on computations and transformations of data.

- **Iteration**
    - **Collections**: Explicit iteration using loops.
    - **Streams**: Implicit iteration. The operations do the iteration behind the scenes.

- **Consumption**
    - **Collections**: Can be traversed multiple times.
    - **Streams**: Can only be traversed once.

- **Mutability**
    - **Collections**: Can be mutable.
    - **Streams**: Always immutable.

- **Laziness**
    - **Collections**: Operations are typically performed eagerly.
    - **Streams**: Operations are performed lazily.

## How and Why to Use Streams?

**How to use Streams?**
1. **Creation**: Streams can be created from various data sources, especially from collections.
2. **Intermediate Operations**: Transform a stream into another stream, e.g., `filter`, `map`, `sorted`.
3. **Terminal Operations**: Produce a result or a side effect, e.g., `forEach`, `collect`, `reduce`.

**Why to use Streams?**
- **Declarative Code**: Focus on the "what" instead of the "how".
- **Functional Style**: Work with stateless lambdas.
- **Parallel Processing**: Easily switch between sequential and parallel execution.
- **Pipelining**: Multiple operations in a single pass.
- **Flexibility and Abstraction**: Suitable for various data sources.

